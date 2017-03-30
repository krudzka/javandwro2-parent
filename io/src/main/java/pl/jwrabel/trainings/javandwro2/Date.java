package pl.jwrabel.trainings.javandwro2;

/**
 * Created by RENT on 2017-03-22.
 */
public class Date implements Comparable {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass() == getClass()) {
            Date date2 = (Date) o;
            if (year > date2.getYear()) {
                return -1;
            } else if (year == date2.getYear()) {
                if (month > date2.getMonth()) {
                    return -1;
                } else if (month == date2.getMonth()) {
                    if (day > date2.getDay()) {
                        return -1;
                    } else if (day == date2.getDay()) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }

        } else {
            return -1;
        }
    }
}
