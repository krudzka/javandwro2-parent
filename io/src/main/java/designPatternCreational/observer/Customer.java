package designPatternCreational.observer;

/**
 * Created by RENT on 2017-03-27.
 */
public class Customer implements Observator {

    private String fullname;


    public Customer(String fullname) {
        this.fullname=fullname;
    }

    @Override
    public void notifyObservator() {
        System.out.println("Customer " + fullname + "notified");

    }
}
