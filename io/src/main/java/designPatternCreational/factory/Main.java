package designPatternCreational.factory;

/**
 * Created by RENT on 2017-03-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Mustang();
        car.drive();

        String name = "mustang";
       Car newCar = CarFactory.create(name);
    }
}
