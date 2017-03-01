package pl.jwrabel.trainings.javaand2.algorithms.arrays;

/**
 * Hello world!
 */
public class ArraysAlgorithmsEven {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 12, 21};
//		{1, -1, 3, -1, -1, 21}

		deleteEven(array); // sets -1 for even numbers

		for (int i = 0; i < array.length; i++) {
			System.out.println("element " + i + " : " + array[i]);
		}
	}

	private static void deleteEven(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int element = array[i];

			if(element % 2 == 0){
				array[i] = -1;
			}
		}
	}

	/*

		********* -> 20
		**********
		********
		|
		V
		20

		narysować kółko


	 */
}
