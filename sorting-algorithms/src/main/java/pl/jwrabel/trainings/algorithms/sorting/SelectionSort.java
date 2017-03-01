package pl.jwrabel.trainings.algorithms.sorting;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class SelectionSort implements SortingAlgorithm {
	public int[] sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int minIndex = findMinIndex(data, i);
			if (minIndex != i) {
				swap(data, i, minIndex);
			}
		}

		return data;
	}


	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static int findMinIndex(int[] array, int startIndex) {
		int minIndex = startIndex;

		for (int i = startIndex + 1; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	@Override
	public String toString() {
		return "Selection sort";
	}
}
