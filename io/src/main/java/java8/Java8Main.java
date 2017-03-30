package java8;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-18.
 */
public class Java8Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą cyfrę");
        double  x = scanner.nextDouble();
        System.out.println("Podaj druga cyfrę");
        double y = scanner.nextDouble();
        System.out.println("Podaj znak");
        String z = scanner.next();

        Operation operation =  null;
        Operation addOperation =(x1,y1)->x1+y1;

        if (z.equals("+")){
           operation = new Add();
        }
        if(z.equals("-")){
            operation = new Substract();
        }
        if(z.equals("*")){
            operation = new Multiply();
        }
        if(z.equals("/")){
            operation = new Divide();
        }
        double result = operation.evaluate(x,y);
        System.out.println("Wynik: " + result);
    }
}
