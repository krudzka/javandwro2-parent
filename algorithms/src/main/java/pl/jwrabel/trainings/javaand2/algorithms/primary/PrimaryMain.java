package pl.jwrabel.trainings.javaand2.algorithms.primary;

import java.util.List;

import static pl.jwrabel.trainings.javaand2.algorithms.primary.Primary.erathostenes;

/**
 * Created by jakubwrabel on 25.02.2017.
 */
public class PrimaryMain {
	public static void main(String[] args) {
//		int x = 4;
//		boolean isXPrimary = Primary.isPrimary(x);
//
//		System.out.println("Liczba " + x + " jest pierwsza: " + isXPrimary);
//
//		int x2 = 50;
//		Primary.printPrimaryNumbersLessThan(x2);
//
//		erathostenes(100);

//		List<Integer> primaryNumbers = Primary.erathostenes(100);

		List<Integer> primeFactors = Primary.primeFactors(130);

		for (Integer primeFactor : primeFactors) {
			System.out.println(primeFactor);
		}
	}
}
