package pl.jwrabel.trainings.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort implements SortingAlgorithm {
	public int[] sort(int[] data) {

		List<Integer> sortedList = new ArrayList<>();


//		for (int number : data) {
//			if (sortedList.isEmpty()) { // if(sortedList.size() == 0)
//				sortedList.add(number);
//			} else {
//				for (int i = 0; i < sortedList.size(); i++) {
//					if (number <= sortedList.get(i)) {
//						sortedList.add(i, number);
//						break;
//					} else if (i == sortedList.size() - 1) {
//						sortedList.add(number);
//						break;
//					}
//				}
//			}
//		}

		for (int number : data) {
			boolean found = false;

			for (int i = 0; i < sortedList.size(); i++) {
				if (number <= sortedList.get(i)) {
					sortedList.add(i, number);
					found = true;
					break;
				}
			}

			if (!found) {
				sortedList.add(number);
			}
		}


//		for (int number : data) {
//			addToListInCorrectOrder(sortedList, number);
//		}


		for (int i = 0; i < sortedList.size(); i++) {
			data[i] = sortedList.get(i);
		}

		return data;

	}

	private void addToListInCorrectOrder(List<Integer> sortedList, int number) {
		boolean found = false;

		for (int i = 0; i < sortedList.size(); i++) {
			if (number <= sortedList.get(i)) {
				sortedList.add(i, number);
				found = true;
				break;
			}
		}

		if (!found) {
			sortedList.add(number);
		}
	}

	@Override
	public String toString() {
		return "Insertion sort";
	}
}
