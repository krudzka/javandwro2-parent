import pl.jwrabel.trainings.javandwro2.MyMessage;

/**
 * Created by RENT on 2017-03-18.
 */
public class MyConsumer extends Thread {
    private MyMessage message;

    public MyConsumer(MyMessage message) {
        this.message = message;
    }

    @Override
    public void run(){
        System.out.println("Consumer started");

       synchronized (message){
           try {
               message.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

        //jeśli cos dostanie
        System.out.println("Consumer works");
        System.out.println(message.getMsg());
    }
}
