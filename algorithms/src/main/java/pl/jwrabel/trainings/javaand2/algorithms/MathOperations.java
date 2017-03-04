package pl.jwrabel.trainings.javaand2.algorithms;

/**
 * Created by jakubwrabel on 02.03.2017.
 */
public class MathOperations {
	public static double divide(double x, double y) {
		if (y == 0) {
			throw new IllegalArgumentException("Could not divide by zero");
		}
		return x / y;
	}

	public static int factorial(int x) {
		if (x > 12 || x < 0) {
			throw new IllegalArgumentException();
		}

		int factorial = 1;

		for (int i = 2; i <= x; i++) {
			factorial *= i;
		}

		return factorial;
	}
}
