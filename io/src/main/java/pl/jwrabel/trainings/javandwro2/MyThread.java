package pl.jwrabel.trainings.javandwro2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-16.
 */
public class MyThread extends Thread {
    int x ;
    int y ;
    int result;
  //  List<Integer> results = new ArrayList<>();

    public MyThread(int x, int y, int result) {
        this.x = x;
        this.y = y;
        //this.result=result;


    }

    @Override
    public void run() {
        int min = x;
        for (int i = x; i < y; i++) {


            if(i<min){
                min=i;
            }

        }
        result = min;
        System.out.println(min);
    }

}
