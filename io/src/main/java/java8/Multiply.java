package java8;

/**
 * Created by RENT on 2017-03-18.
 */
public class Multiply implements Operation {
    @Override
    public double evaluate(double x, double y) {
        return x*y;
    }
}
