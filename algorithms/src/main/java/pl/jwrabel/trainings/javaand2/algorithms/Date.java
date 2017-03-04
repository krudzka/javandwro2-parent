package pl.jwrabel.trainings.javaand2.algorithms;

/**
 * Created by jakubwrabel on 04.03.2017.
 */
public class Date {
	public static final int MIN_MONTH = 1;
	public static final int MAX_MONTH = 12;
	public static final int MIN_DAY = 1;
	public static final int MIN_YEAR = 1;
	public static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public void addDays(int x) { // x >= 0

	}

	public void addMonths(int x) { // x >= 0
		// dla x >= 0
		if (x > 0) {
			month += x;
			addYears(month / MAX_MONTH);
			month = month % MAX_MONTH;
		} else {
			throw new IllegalArgumentException("Could not add negative month");
		}

		// dla x dowolnego
		if (month > MIN_MONTH) {
			year += month / MAX_MONTH;
			month = month % MAX_MONTH;
		} else {
			year -= month / MAX_MONTH + 1;
			month = MAX_MONTH - month % MAX_MONTH;
		}
		// LUB inne dla x dowolnego
		if (month > MIN_MONTH) {
			while (month > MAX_MONTH) {
				year++;
				month -= MAX_MONTH;
			}
		} else {
			while (month < MIN_MONTH) {
				year--;
				month += MAX_MONTH;
			}
		}
	}

	public void addYears(int x) {
		if (x > 0) {
			year += x;
		}
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
