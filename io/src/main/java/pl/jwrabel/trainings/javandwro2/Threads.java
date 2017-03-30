package pl.jwrabel.trainings.javandwro2;

/**
 * Created by RENT on 2017-03-15.
 */
public class Threads {
    public static void main(String[] args) {
        Thread thread = new Thread() { // klasa anonimowa rozszerzajaca klase thread
            @Override
            public void run() { //metoda run jest nadpisana, piszemy w niej  to co sie ma wykonac  w wątku
                String s = "";
                long start = System.nanoTime();//zwraca czas w ns
                for (int i = 0; i < 50000; i++) {
                    s += "ABC";

                }
                double duration = (System.nanoTime() - start) / 1_000_000_000d;
                System.out.println("Duration: " + duration);
            }
        };

        thread.start();

        Thread thread2 = new Thread() { // klasa anonimowa rozszerzajaca klase thread
            @Override
            public void run() { //metoda run jest nadpisana, piszemy w niej  to co sie ma wykonac  w wątku
                String s = "";
                long start = System.nanoTime();//zwraca czas w ns
                for (int i = 0; i < 50000; i++) {
                    s += "ABC";

                }
                double duration = (System.nanoTime() - start) / 1_000_000_000d;
                System.out.println("Duration: " + duration);
            }
        };

        thread2.start();




    }
}
