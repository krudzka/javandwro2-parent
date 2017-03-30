package designPatternCreational.observer;

/**
 * Created by RENT on 2017-03-27.
 */
public class ObservatorMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Adam Kowalski");
        Customer customer2 = new Customer("Piotr Adamksi");

        Shop shop = new Shop();

        shop.registerObservator(customer1);
        shop.registerObservator(customer2);

        shop.discount();
    }
}
