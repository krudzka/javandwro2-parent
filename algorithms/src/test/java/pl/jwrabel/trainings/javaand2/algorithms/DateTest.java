package pl.jwrabel.trainings.javaand2.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jakubwrabel on 04.03.2017.
 */
public class DateTest {
	@Test
	public void constructor_shouldFillFields() {
		// given
		int day = 5;
		int month = 10;
		int year = 2010;

		// when
		Date date = new Date(day, month, year);

		// then
		assertEquals(date.getDay(), day);
		assertEquals(date.getMonth(), month);
		assertEquals(date.getYear(), year);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructor_shouldThrowExceptionForIncorrectData() {
		// given
		int day = 0;
		int month = -1;
		int year = 2010;

		// when
		new Date(day, month, year);
	}

	@Test
	public void setMonth_correctData() {
		// given
		int month = 10;
		Date date = new Date(1, 1, 1);

		// when
		date.setMonth(month);

		// then
		assertEquals(month, date.getMonth());
	}

	@Test(expected = IllegalArgumentException.class)
	public void setMonth_shouldThrowExceptionForNegativeMonth() {
		// given
		int month = -5;
		Date date = new Date(1, 1, 1);

		// when
		date.setMonth(month);
	}


}