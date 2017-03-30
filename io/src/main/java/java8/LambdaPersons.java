package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by RENT on 2017-03-18.
 */
public class LambdaPersons {


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adam", "Nowak", "Wrocław",1));
        personList.add(new Person("Adam", "Kowalska", "Warszawa",2));
        personList.add(new Person("Karolina", "Iłak", "Warszawa",3));
        int lookingFor =1;

       personList.stream().filter(p->p.getId()==lookingFor).forEach(p->System.out.println(p.toString()));

//        Map<String,List<Person>>groupByNames = personList.stream().collect(groupingBy(p->p.getFirsName()));
//        groupByNames.entrySet().stream().forEach(e->{
//            System.out.println(e.getKey());
//            System.out.println(e.getValue().stream().peek(p->p.getCity()).count());
//        });
//
//        Map<String,List <Person>> groupByCities = personList.stream().collect(groupingBy(p->p.getCity()));
//        groupByCities.entrySet().stream().forEach(entry->{
//            System.out.println(entry.getKey().toUpperCase());
//            System.out.println(entry.getValue().stream().count());
//        });

//        for (Map.Entry<String, List<Person>> entry: groupByCities.entrySet()){
//            System.out.println("Map key: " + entry.getKey());
//            System.out.println("Value key " + entry.getValue());
//        }
////partitionigBy
//        Map<Boolean, List<Person>> adam = personList.stream()
//                .collect(partitioningBy(p->p.getFirsName().equals("Adam")));
//
//        List<Person>people = adam.get(false); // nie spelnia warunku
//        List<Person>peopleAdam = adam.get(true); // spełnia warunek
//
//        //groupingBy
//        Map<String,List<Person>> firstNamesMap= personList.stream().collect(groupingBy(p->p.getFirsName()));
//        List<Person> adam1= firstNamesMap.get("Adam"); //zwroci nam osoby o imieniu Adam
//
//        // przechodzenie po mapie
//        for (Map.Entry<String, List<Person>> entry : firstNamesMap.entrySet()){
//            System.out.println("Map key: " + entry.getKey());
//            System.out.println("Map value: " + entry.getValue());
//
//        }
//
//
//       double size =  personList.stream().mapToInt(p->p.getLastName().length()).summaryStatistics().getAverage();
//        System.out.println(size);
//
//        String result = personList.stream()
//                .map(person -> person.toString())
//                .collect(Collectors.joining("\n", "START\n", "\nKONIEC"));
//        System.out.println(result);
//
//

//                personList.stream().peek(person -> System.out.println(person.toString()))
//                .filter(person -> person.getCity().equals("Warszawa"))
//                .map(person -> person.getLastName() + " " + person.getFirsName() + "," + person.getCity().toUpperCase())
//                .forEach(person -> System.out.println(person));

//
//        personList.stream().filter(person -> person.getCity().equals("Warszawa")).forEach(person -> System.out.println(person));
//        personList.stream().filter(person -> person.getCity().equals("Warszawa")).
//                map(person -> person.getFirsName() + " " + person.getLastName() + " " + person.getCity());
//        personList.stream().sorted(Comparator.comparing(person -> person.getLastName())).forEach(person -> System.out.println(person.getLastName()));
//
//        int number = 9;
//        boolean firstNumber = IntStream.range(2, number / 2 + 1).noneMatch(n -> number % n == 0);
//        System.out.println("Jest liczbą pierwszą " + firstNumber);
//
//        IntStream.range(2, 100)
//                .filter(x -> IntStream.range(2, number / 2 + 1)
//                        .noneMatch(n -> number % n == 0))
//                .forEach(x -> System.out.println(x));


    }
}
