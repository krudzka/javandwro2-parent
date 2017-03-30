package java8;

/**
 * Created by RENT on 2017-03-18.
 */
public class Person {
    private String firsName;
    private String lastName;
    private String city;
    private int id;


    @Override
    public String toString() {
        return
                firsName + " "
               + lastName ;
    }

    public Person(String firsName, String lastName, String city,int id) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.city = city;
        this.id =id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
