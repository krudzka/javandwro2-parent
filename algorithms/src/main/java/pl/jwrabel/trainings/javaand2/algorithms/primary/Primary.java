package pl.jwrabel.trainings.javaand2.algorithms.primary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 25.02.2017.
 */
public class Primary {
	public static boolean isPrimary(int x) {
		if (x < 2) {
			return false;
		}

		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void printPrimaryNumbersLessThan(int x) {
		for (int i = 2; i < x; i++) {

			boolean isPrimary = isPrimary(i);
			if (isPrimary) {
				System.out.println(i);
			}


//			if( isPrimary(i)) {
//				System.out.println(i);
//			}


		}
	}

	// SITO ERATOSTENESA
//	public static void erathostenes(int x) {
//		int[] array = new int[x + 1];
//
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i;
//		}
//
//		// WYKRESLANIE
//		for (int i = 2; i <= Math.sqrt(x); i++) {
//			if (array[i] != -1) {                        // j += i
//				for (int j = 2 * i; j < array.length; j = j + i) {
//					array[j] = -1;
//				}
//			}
//		}
//
//		for (int i = 2; i < array.length; i++) {
//			if (array[i] != -1) {
//				System.out.println(array[i]);
//			}
//		}
//
//	}
//

	public static List<Integer> erathostenes(int x) {
		int[] array = new int[x + 1];

		// Wypełnianie tablicy
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		// Wykreślanie (sito Eratostenesa)
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (array[i] != -1) {                        // j += i
				for (int j = 2 * i; j < array.length; j = j + i) {
					array[j] = -1;
				}
			}
		}


		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < array.length; i++) {
			if (array[i] != -1) {
				list.add(array[i]);
			}
		}

		return list;
	}

	public static List<Integer> primeFactors(int x){
		List<Integer> primeNumbers = erathostenes(x);
		int primeNumberIndex = 0;

		List<Integer> primeFactors = new ArrayList<Integer>();

		while(x > 1){
			Integer currentPrimeNumber = primeNumbers.get(primeNumberIndex);

			if(x % currentPrimeNumber == 0){
				x = x / currentPrimeNumber;
				primeFactors.add(currentPrimeNumber);
			} else {
				primeNumberIndex++;
			}

		}

		return primeFactors;
	}
}
