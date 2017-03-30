package java8;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by RENT on 2017-03-18.
 */
public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream().forEach(x-> System.out.println(x));
        list.stream().forEach(System.out::println);
        list.forEach(System.out::println);

        list.stream().forEach(x->{
            System.out.println(x);
            System.out.println("BLA");
        });

        list.stream().filter(x-> x<2).forEach(x-> System.out.println(x));
        boolean mathces =list.stream().anyMatch(x->x==2); // czy ktorykolwiek element spelnia nasz warunek
        list.stream().count(); //policz ilosc elementow w strumieniu
        long even = list.stream().filter(x-> x%2==0).count();
        boolean noZero =list.stream().noneMatch(x-> x==0);
        list.stream().sorted().forEach(x-> System.out.println(x)); // sortuje domyslnym komparatorem
        List<Integer> evenList = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList());

        list.stream().map(x->x*x).forEach(x-> System.out.println(x));
        list.stream().map(x-> "Numer: " + x).collect(Collectors.toList());
        IntStream.range(2,100).forEach(x-> System.out.println(x)); // generuje streama z tych liczb
        int [] x ={1,2,3,4,5};
        Arrays.stream(x).forEach(elem-> System.out.println(elem));
        Object[]objects = list.stream().toArray();


        IntSummaryStatistics intSummaryStatistics =list.stream().mapToInt(p->p).summaryStatistics();
       // list.stream().sorted((b,y)->0).forEach(x-> System.out.println(x));

        //spłaszczannie
        List<List<String>> lists = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        lists.add(strings);
        ArrayList<String> strings2 = new ArrayList<>();
        strings.add("C");
        strings.add("D");
        lists.add(strings);

        lists.stream().flatMap(l-> l.stream()).collect(Collectors.toList());

        //find first



    }
}
