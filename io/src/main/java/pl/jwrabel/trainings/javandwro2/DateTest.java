package pl.jwrabel.trainings.javandwro2;

import java.util.*;

/**
 * Created by RENT on 2017-03-22.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(1, 12, 2016);
        Date date2 = new Date(4, 6, 2016);
        Date date3 = new Date(5, 6, 2010);
        Date date4 = new Date(4, 6, 2010);

        List<Date> dates = new ArrayList<>();
        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(date4);

//        System.out.println("Lista przed posortowaniem");
//        dates.forEach((x -> System.out.println(x)));
//        Collections.sort(dates);
//        System.out.println("Lista po sortowaniu");
//        dates.forEach(x -> System.out.println(x));


        System.out.println("Lista przed posortowaniem");
        dates.forEach((x -> System.out.println(x)));
        dates.sort(new Comparator<Date>() {
            @Override
            public int compare(Date d1, Date d2) {

                if (d1.getYear() > d2.getYear()) {
                    return 1;
                } else if (d1.getYear() == d2.getYear()) {
                    if (d1.getMonth() > d2.getMonth()) {
                        return 1;
                    } else if (d1.getMonth() == d2.getMonth()) {
                        if (d1.getDay() > d2.getDay()) {
                            return 1;
                        } else if (d1.getDay() == d2.getDay()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }

                } else {
                    return -1;
                }

            }
        });
        System.out.println("Lista po sortowaniu");
        dates.forEach(x -> System.out.println(x));
    }
}
