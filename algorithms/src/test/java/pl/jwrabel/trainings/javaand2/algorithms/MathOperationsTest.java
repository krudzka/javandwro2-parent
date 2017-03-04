package pl.jwrabel.trainings.javaand2.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jakubwrabel on 02.03.2017.
 */
public class MathOperationsTest {
	@Test
	public void divide_4by2() {
		// given
		double x = 4;
		double y = 2;

		// when
		double result = MathOperations.divide(x, y);

		// then
		assertEquals(result, 2, 0.0000001);
	}


	@Test
	public void divide_complexCase() {
		// given
		double x = 10000;
		double y = 33;

		// when
		double result = MathOperations.divide(x, y);

		// then
		assertEquals(result, 303.0303030303, 0.0000001);
	}


	@Test(expected = IllegalArgumentException.class)
	public void divide_byZero() {
		// given
		double x = 1;
		double y = 0;

		// when
		MathOperations.divide(x, y);
	}

	@Test
	public void factorial_simpleCase() {
		// given
		int x = 3;

		// when
		int result = MathOperations.factorial(x);

		// then
		assertEquals(result, 6);
	}

	@Test
	public void factorial_complexCase() {
		// given
		int x = 10;

		// when
		int result = MathOperations.factorial(x);

		// then
		assertEquals(result, 3_628_800);
	}

	@Test
	public void factorial_shouldReturnResultFor12() {
		// given
		int x = 12;

		// when
		int result = MathOperations.factorial(x);

		// then
		assertEquals(result, 479_001_600);
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorial_shouldThrowErrorFor13() {
		// given
		int x = 13;

		// when
		MathOperations.factorial(x);
	}

	@Test
	public void factorial_shouldReturn1forX0() {
		// given
		int x = 0;

		// when
		int result = MathOperations.factorial(x);

		// then
		assertEquals(result, 1);
		assertFalse(false);
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorial_shouldThrowErrorForNegative() {
		// given
		int x = -1;

		// when
		MathOperations.factorial(x);
	}

}
