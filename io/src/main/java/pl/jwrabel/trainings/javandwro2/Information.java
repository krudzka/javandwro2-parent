package pl.jwrabel.trainings.javandwro2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-16.
 */
public class Information {
    public static void main(String[] args) throws InterruptedException {
        Information information = new Information();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i <100000 ; i++) {
                    information.setInf("ABC");
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i <100000 ; i++) {
                    information.setInf("XYZ");
                }
            }

        };
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(information.getInf());
    }
    private List<String> list = new ArrayList<>();

   public synchronized String getInf(){

       return list.get(0);

    }

    public void setInf(String inf) {
        list.clear();
        list.add(inf);
    }
}
