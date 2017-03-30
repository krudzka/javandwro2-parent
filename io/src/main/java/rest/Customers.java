package rest;

/**
 * Created by RENT on 2017-03-23.
 */

public class Customers {
    private String firstName;
    private String lastName;
    private int birthYear;
    private double height;
    private String id;

    public Customers(){

    }
    public Customers(String firstName, String lastName, int birthYear, double height, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
