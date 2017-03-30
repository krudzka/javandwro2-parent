package pl.jwrabel.trainings.javandwro2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by RENT on 2017-03-22.
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 3, 5, 1);
        System.out.println("Przed sortowaniem");
        integers.forEach(x-> System.out.println(x));

        Collections.sort(integers);
        System.out.println("Po sortowaniu");
        integers.forEach(x-> System.out.println(x));

        List<Pointt> points = Arrays.asList(new Pointt(6,4),new Pointt(6,7),new Pointt(7,5));
        System.out.println("Lista punktów przed sortowaniem");
        points.stream().forEach((point)-> System.out.println(point));

        Collections.sort(points);
        System.out.println("Lista punktów po posortowaniu");
        points.stream().forEach((point)-> System.out.println(point));






        //varargsy
        pritnNumbers(1);
        pritnNumbers(1, 2);
        pritnNumbers(1, 2, 3);
        pritnNumbers();
    }




    // varargsy
    public static void pritnNumbers(int... numbers) { //<- to co jest pod tym numbers to jakby tablica o zmienniej liczbei argumenow

        //po typie ... var args (variable arguments) metoda ktora moze porzyjmowac rozna ilosc argumentow
       for (int numbber : numbers){
           System.out.println(numbber);
       }
    }
}
