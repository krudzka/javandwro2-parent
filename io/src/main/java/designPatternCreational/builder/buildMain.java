package designPatternCreational.builder;

/**
 * Created by RENT on 2017-03-27.
 */
public class buildMain {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kowalski","123")
                .withfirstName("Jakyb")
                .build();
    }
}
