package maps;

import java8.Person;

import java.util.*;

/**
 * Created by RENT on 2017-03-21.
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, String> exampleMap = new HashMap<>();

        //dodawanie do mapy
        exampleMap.put("1", "Adam Kowalski");
        exampleMap.put("2", "Piotr Nowak");

        //wyciaganie z mapy
        String exampleValue = exampleMap.get("1");
        System.out.println(exampleValue);

        List<String> list = new ArrayList<>();
        list.add("Piotr");
        list.add("Adam");

        System.out.println("List Content");
        for (String elem : list) {
            System.out.println(elem);
        }

        List<Point> listOfPoints = new ArrayList<>();
        listOfPoints.add(new Point(5, 14));
        listOfPoints.add(new Point(10, 20));

        for (Point elem : listOfPoints) {
            System.out.println("Punkt o X: " + elem.getX());
            System.out.println("Punkt o Y: " + elem.getY());
        }

        //iterowanie po mapie
        Set<Map.Entry<String, String>> entries = exampleMap.entrySet();
        for (Map.Entry<String, String> elem : entries) {
            System.out.println(elem.getKey());
            System.out.println(elem.getValue());
        }



        Map<String,List<Person>> personMap = new HashMap<>();

        List<Person> people = new ArrayList<>();


        people.add(new Person("Adam", "Nowak", "Wrocław",1));
        people.add(new Person("Julia", "Kowalska", "Warszawa",2));

        personMap.put("a",people);

        Set<Map.Entry<String,List<Person>>> entries2 =personMap.entrySet();



    }
}
