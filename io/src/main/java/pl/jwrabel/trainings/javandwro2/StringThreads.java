package pl.jwrabel.trainings.javandwro2;

/**
 * Created by RENT on 2017-03-15.
 */
public class StringThreads extends Thread {
    public static void main(String[] args) {
        StringThreads thread1 = new StringThreads("Watek 1");
        StringThreads thread2 = new StringThreads("Watek 2");

        thread1.start();
        thread2.start();
    }

    private String name;

    public StringThreads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(name + " " + i);
            }
        }
    }
}
