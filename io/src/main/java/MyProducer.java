import pl.jwrabel.trainings.javandwro2.MyMessage;

/**
 * Created by RENT on 2017-03-18.
 */
public class MyProducer extends Thread {
    private MyMessage message;
    public MyProducer(MyMessage message) {
        this.message=message;
    }

    @Override
    public void run(){
        System.out.println("Producer started");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer working");

        synchronized (message){
            message.setMsg("Hello World");
            message.notify();
        }



    }
}
