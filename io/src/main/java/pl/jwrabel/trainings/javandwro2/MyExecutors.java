package pl.jwrabel.trainings.javandwro2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Created by RENT on 2017-03-18.
 */
//public class MyExecutors {

//    volatile int x =0;// zawsze czyta z tego samego miejsca
//
//
//    public static void main(String[] args) throws InterruptedException, ExecutionException {
//    //    ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Callable<Integer> callable = new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                Thread.sleep(5000);
//                return 4;
//            }
//        };
//       // Future<Integer> submit = executorService.submit(callable);
//
//        while(!submit.isDone()){
//            System.out.println("Waiting for callable");
//            Thread.sleep(100);
//        }
//        System.out.println(submit.get());
//    }
//}
