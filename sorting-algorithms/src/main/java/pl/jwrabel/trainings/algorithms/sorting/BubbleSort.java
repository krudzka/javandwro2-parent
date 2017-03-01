package pl.jwrabel.trainings.algorithms.sorting;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort implements SortingAlgorithm {
	public int[] sort(int[] data) {
		boolean swapped = true;

		int index = 0;
		while (swapped) {
			swapped = false;
			for (int j = 0; j < data.length - 1 - index; j++) {
				if (data[j] > data[j + 1]) {
					swap(data, j, j + 1);
					swapped = true;
				}
			}
			index++;
		}

		return data;
	}


	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	@Override
	public String toString() {
		return "Bubble sort";
	}
}
