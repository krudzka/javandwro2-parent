package pl.jwrabel.trainings.javaand2.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
