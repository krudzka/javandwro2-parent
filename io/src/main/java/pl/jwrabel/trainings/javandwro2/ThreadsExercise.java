package pl.jwrabel.trainings.javandwro2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-16.
 */
public class ThreadsExercise {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        final List<String> ints = new ArrayList<>();
        Thread thread = new Thread() {
            @Override
            public void run() {
                String s = "a";
                for (int i = 0; i < 100000; i++) {
                    s += "bc";
                }
                ints.add(s);

            }

        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {


                char[][] twoDismensions = new char[100][100];
                char a = 'A';
                for (int i = 0; i < twoDismensions.length; i++) {
                    if(!ints.isEmpty()){
                        return;
                    }

                    for (int j = 0; j < twoDismensions[i].length; j++) {

                        twoDismensions[i][j] = a;
                        System.out.print(twoDismensions[i][j]);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        a++;

                    }
                    System.out.println();


                }


//                for (int i = 0; i < 1000000000; i++) {
//                    System.out.print("...                                                                                                                                                                                  ");
//                    System.out.print("\\                                                                                                                                  ");
//                    System.out.print("|                                                                                                                                                                      ");
//                    System.out.print("/                                                                                                                                                              ");


            }

        };

        thread.start();
        thread2.start();
        thread.join();



    }
};


