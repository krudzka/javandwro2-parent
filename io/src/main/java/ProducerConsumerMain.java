import pl.jwrabel.trainings.javandwro2.MyMessage;

/**
 * Created by RENT on 2017-03-18.
 */
public class ProducerConsumerMain {
    public static void main (String[] args){

        MyMessage message = new MyMessage();

        MyConsumer consumer = new MyConsumer(message);
        MyProducer producer = new MyProducer(message);
        consumer.start();
        producer.start();
    }
}
