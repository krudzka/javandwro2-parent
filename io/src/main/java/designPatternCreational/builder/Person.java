package designPatternCreational.builder;

/**
 * Created by RENT on 2017-03-27.
 */
public class Person {
    private String firstName;
    private String lastName;  //required
    private String id; //required
    private double weight;
    private int birth;
    private String hair;

    public static class Builder {
        private String firstName;
        private String lastName;
        private String id;
        private double weight;
        private int birth;
        private String hair;

        public Builder(String lastName, String id) {
            this.lastName = lastName;
            this.id = id;
        }

        public Builder withfirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.id = id;
            person.firstName = firstName;
            person.lastName = lastName;
            person.weight = weight;
            person.birth = birth;
            person.hair = hair;
            return person;

        }
    }
}
