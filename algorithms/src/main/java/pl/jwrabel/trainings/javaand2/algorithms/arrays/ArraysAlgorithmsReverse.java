package pl.jwrabel.trainings.javaand2.algorithms.arrays;

/**
 * Hello world!
 */
public class ArraysAlgorithmsReverse {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 12, 21};

		int[] revertedArray = revertArray(array);

		for (int i = 0; i < revertedArray.length; i++) {
			System.out.println("element " + i + " : " + revertedArray[i]);
		}
	}

	private static int[] revertArray(int[] array) {
		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - 1 - i];
		}

		return newArray;
	}

	/*
			1, 5, 10
			4, 8, 1

			|
			V

			5, 13, 11


	 */

}
