package maps;

import java8.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by RENT on 2017-03-21.
 */
public class MySecondMap {
    public static void main(String[] args) {
        Point point1 = new Point(4, 5);
        Point point2 = new Point(7, 11);
        String string1 = "a";
        String string2 = "b";

        Map<Point,String>myValue = new HashMap<>();

        myValue.put(point1,string1);
        myValue.put(point2,string2);

        Set<Map.Entry<Point,String>> value = myValue.entrySet();



        Person person1 = new Person("Adam", "Kowalski", "Warszawa",1);
        Person person2 = new Person("Karolina", "Wiek", "Karolów",2);


        Map<Person,Map<Point,String>> myMap = new HashMap<>();

    }
}
