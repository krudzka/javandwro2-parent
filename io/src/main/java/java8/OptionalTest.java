package java8;

import java.util.List;
import java.util.Optional;

/**
 * Created by RENT on 2017-03-21.
 */
public class OptionalTest {


    public static void main(String[] args) {
        System.out.println(userName().orElse("Undefined"));
    }


    public static Optional<String> userName() {
        return Optional.of("Adam Kowalski");
    }

    public static String[] splitToLetters(Optional<String> text) {
        return text.orElseThrow(() -> new IllegalArgumentException("Musisz podać tekst!")).split("");
    }


//    public static Optional<List<Double>> findZeroValues(Optional<Double> a, Optional<Double> b, Optional<Double> c) {
//        double x1;
//        double x2;
//        double delta = 1;
//        if (a.isPresent() && b.isPresent() && c.isPresent()) {
//            delta = Math.pow(b.get(), 2) - 4 * a.get() * c.get();
//             x1 = (-b.get() - Math.sqrt(delta)) / 2 * a.get();
//             x2 = (-b.get() + Math.sqrt(delta)) / 2 * a.get();
//        } return delta;

//    }
//}
}
