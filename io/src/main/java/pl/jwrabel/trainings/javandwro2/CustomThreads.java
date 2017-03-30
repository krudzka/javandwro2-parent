package pl.jwrabel.trainings.javandwro2;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-03-16.
 */
public class CustomThreads {
    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();
        int [] array = new int[10000];
        Random random = new Random ();
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt();
        }




        MyThread myThread = new MyThread(array[0],array[2500],0);
        MyThread myThread1 = new MyThread(array[2500],array[5000],0);
        MyThread myThread2 = new MyThread(array[5000],array[7500],0);
        MyThread myThread3 = new MyThread(array[7500],array[9999],0);
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread.join();
        myThread1.join();
        myThread2.join();
        myThread3.join();

        List<Integer> results = new ArrayList<>();
        results.add(myThread.result);
        results.add(myThread1.result);
        results.add(myThread2.result);

        int minResult = results.get(0);

        for (int i = 0; i <results.size() ; i++) {
            if(results.get(i)<minResult){
                minResult=results.get(i);
            }

        }
       long end = System.nanoTime()-start;
        System.out.println(minResult);
        System.out.println(end);


    }
}
