package pl.jwrabel.trainings.algorithms;

import pl.jwrabel.trainings.algorithms.sorting.BubbleSort;
import pl.jwrabel.trainings.algorithms.sorting.SortingAlgorithm;

public class App {
	public static void main(String[] args) {
		SortingAlgorithm sortingAlgorithm = new BubbleSort();

		int data[] = {10, 5, 3, 1, 20, 4};
		printArray("Data before", data);

		System.out.println("Sorting using " + sortingAlgorithm);

		int[] sorted = sortingAlgorithm.sort(data);
		printArray("Data sorted", sorted);
	}

	private static void printArray(String description, int[] data) {
		System.out.println("---   " + description + "   ---");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

			if (i != (data.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
	}
}
