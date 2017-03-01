package pl.jwrabel.trainings.javaand2.algorithms.multidimensional;

/**
 * Created by jakubwrabel on 28.02.2017.
 */
public class MultiArray {
	public static void main(String[] args) {
//		int[] array = new int[10];
//		int[] array2 = new int[]{1, 2, 3};
//		int[] array3 = {1, 2, 3};
//		int a = array[0];
//
//
//		int[][] array4 = new int[10][];
//		int[][] array5 = new int[10][10];
//		int[][] array6 = new int[][]{
//				{1, 2, 3},
//				{3, 4, 5},
//				{10, 20, 80}
//		};
//
//		int[] embArr = array6[0];
//		int b = array5[0][0];
//
//		array6[0] = new int[3];
//		array6[0][0] = 6;
//


		int[][] array6 = new int[][]{
				{1, 2, 3},
				{3, 4, 5},
				{10, 20, 80}
		};

//		array6.length;
//		array6[0].length;


		// wypisywanie "tablicy wierszy"
		for (int i = 0; i < array6.length; i++) {

			int[] nestedArray = array6[i];
			for (int j = 0; j < nestedArray.length; j++) {
//				System.out.print(array6[i][j] + " ");
				System.out.print(nestedArray[j] + " ");
			}
			System.out.println();

		}

		System.out.println("---------------");

		for (int i = 0; i < array6.length; i++) {
			for (int j = 0; j < array6[i].length; j++) {
				System.out.print(array6[j][i] + " ");
			}
			System.out.println();
		}


		// TABLICĘ KOLUMN arr[x][y]
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		printArray(array);

		System.out.println("---------------------------------");

		int sizeX = 5;
		int sizeY = 4;

		int[][] arrayTmp = new int[sizeX][sizeY];


		for (int y = 0; y < sizeY; y++) {
			for (int x = 0; x < sizeX; x++) {
				arrayTmp[x][y] = sizeX * y + x + 1;
			}
		}

		int counter = 1;
		for (int y = 0; y < sizeY; y++) {
			for (int x = 0; x < sizeX; x++) {
				arrayTmp[x][y] = counter;
				counter++;
			}
		}

		for (int i = 0; i < sizeX * sizeY; i++) {
			arrayTmp[i % sizeX][i / sizeX] = i;
		}

		printArray(arrayTmp);



		int x = 4;
		int y = 3;

		int[][] arrayIn = new int[x][x];
		int[][] arrayOut = new int[x][x];


		for (int i = 0; i < arrayIn.length; i++) {
			for (int j = 0; j < arrayIn[0].length; j++) {
				arrayOut[j][i] = arrayIn[i][j];
			}
		}

		int[][] arrayIn1 = new int[x][y];
		int[][] arrayOut1 = new int[y][x];

		for (int i = 0; i < arrayIn.length; i++) {
			for (int j = 0; j < arrayIn[0].length; j++) {
				arrayOut1[j][i] = arrayIn1[i][j];
			}
		}





	}

	private static void printArray(int[][] array) {
		for (int y = 0; y < array[0].length; y++) {
			for (int x = 0; x < array.length; x++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}
	}
}
