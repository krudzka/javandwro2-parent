package pl.jwrabel.trainings.javaand2.algorithms;

/**
 * Created by jakubwrabel on 04.03.2017.
 */
public class Date {
	public static final int MIN_MONTH = 1;
	public static final int MAX_MONTH = 12;
	public static final int MIN_DAY = 1;
	public static final int MIN_YEAR = 1;

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= MIN_DAY && day < 31) {
			this.day = day;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= MIN_MONTH && month <= MAX_MONTH) {
			this.month = month;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= MIN_YEAR) {
			this.year = year;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
