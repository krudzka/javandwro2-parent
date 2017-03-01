package pl.jwrabel.trainings.javaand2.algorithms.gcd;

/**
 * Created by jakubwrabel on 27.02.2017.
 */
public class GCD {
	public static double gcd(double k, double n) {
		if (k == 0) {
			return n;
		} else {
			return gcd(n % k, k);
		}
	}
}
