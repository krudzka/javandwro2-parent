package java8;

import java.util.Optional;

/**
 * Created by RENT on 2017-03-21.
 */
public class Optionals {
    public static void main(String[] args) {
        //Tworzenie optional

        //1.optional.empty()
        Optional<Object>emptyOptional = Optional.empty();

        //2.Optional.of(..)
        String a = "A";
        Optional<String>optional2 = Optional.of(a); // nie mozemy tu wstawic nulla -> leci wyjątek

        //3. optional.ofNullable(...)
        Optional<String>optional3 = Optional.ofNullable("ab");


        //Metody optionali
        //1.isPresent

        String s = "abc";
        Optional<String>stringOptional = Optional.of(s);
        stringOptional.isPresent();  //true
        String snull = null;
        Optional<String> nullStringOp =Optional.ofNullable(snull);
        nullStringOp.isPresent(); //false

        //2.get

        String s1 = stringOptional.get(); //zwraca element ktory jest w srodku wywali sie jak bedziemy mieli nulla w srodku

        //3. orElse

        String myString = "ABC";
        Optional<String> myStringOptional = Optional.of(myString);
        String orElse = myStringOptional.orElse("DEFAULT"); // zwraca nam stringa na ktorym wywolujemy, a jak tam nic nie ma to zwroci nam ten default

        //4. orElseGet

        Optional<String> testOptional = null;
        String value3= testOptional.orElseGet(()->System.lineSeparator()); // jak optional ma nulla to wykonuje jakas operacje

        //5. orElseThrow

        String value4 = testOptional.orElseThrow(()->new IllegalArgumentException());

        //6. filter


        String value5 = testOptional.filter(x->!x.isEmpty()).orElse("Defalut");

        //7.map

//        Optional<Double> bytes =pointOptional.map(x->x.getX());

        //8.ifPresent (Consumer)

        testOptional.ifPresent(x-> System.out.println(x));
        //9.flatMap
    }
}
