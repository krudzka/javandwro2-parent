package pl.jwrabel.trainings.javaand2.algorithms.arrays;

/**
 * Hello world!
 */
public class ArraysAlgorithmsMethod {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 10, 20};
		int sum = sumOfArray(array);
		System.out.println("Suma " + sum);

//        System.out.println("Suma " + sumOfArray(array));
	}

	static int sumOfArray(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		for (int element : array) {
			sum += element;
		}

		// array.for + TAB -> generowanie for-each

		return sum;
	}
}
