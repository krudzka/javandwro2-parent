package designPatternCreational;

/**
 * Created by RENT on 2017-03-27.
 */
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    // druga wersja

    public Singleton getInstance() {
        return INSTANCE; // dzieki temu sie odwolamy przez metode , dobra praktyka bo mamy tutaj zastosowanie hermetyzacji/enkapsulacji
    }
}
