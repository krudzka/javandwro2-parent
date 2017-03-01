package pl.jwrabel.trainings.javaand2.algorithms.arrays;

/**
 * Hello world!
 */
public class ArraysAlgorithmsReverseArraysSum {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 12, 21};
		int[] array2 = {3, 1, 10, 8, 2, 5};

		int[] arraysSum = sumArrays(array1, array2);

		for (int i = 0; i < arraysSum.length; i++) {
			System.out.println("element " + i + " : " + arraysSum[i]);
		}
	}

	private static int[] sumArrays(int[] array1, int[] array2) {
		int[] sumArray = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}

		return sumArray;
	}
}
