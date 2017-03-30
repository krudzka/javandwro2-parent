package pl.jwrabel.trainings.javandwro2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-16.
 */
public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> ints = new ArrayList<>();
        Object obj = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (obj) {
                        ints.add(i);
                    }

                }
            }

        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (obj) {
                        ints.add(i);
                    }

                }
            }
        };

        thread.start();
        thread2.start();
        thread.join(); //poowduje ze kod po starcie wykona sie dopiero zakonczeniu wykonaniu sie watku ( glowny watek ma czekac na ten na ktorym wywolujemy metode join)
        thread2.join();
        System.out.println("Rozmiar listy " + ints.size());
    }
}
