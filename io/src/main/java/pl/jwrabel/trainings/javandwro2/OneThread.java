package pl.jwrabel.trainings.javandwro2;

import java.util.Random;

/**
 * Created by RENT on 2017-03-16.
 */
public class OneThread {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();


        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        long end = System.nanoTime() - start;
        System.out.println(min);
        System.out.println(end);

    }
}
