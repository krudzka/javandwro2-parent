package maps;

import java8.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by RENT on 2017-03-21.
 */
public class MyMap {

    public static void main(String[] args) {


        Point point1 = new Point(4, 5);
        Point point2 = new Point(7, 11);

        Person person1 = new Person("Adam", "Kowalski", "Warszawa",1);
        Person person2 = new Person("Karolina", "Wiek", "Karolów",2);

        Map<Person, Point> map = new HashMap<>();
        map.put(person1, point1);
        map.put(person2, point2);

        Set<Map.Entry<Person, Point>> entries = map.entrySet();

        for (Map.Entry<Person, Point> elem : entries) {
            Person key = elem.getKey();
            System.out.println(key);
            Point value = elem.getValue();
            System.out.print(value.getX() + ",");
            System.out.println(value.getY());


        }


    }
}