import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {
    public static void main(String[] args) throws InterruptedException {
        List<Producer> producerList = new ArrayList<>();
        List<Consumer> consumerList = new ArrayList<>();
        Mediator m = new Mediator();

        producerList.add(new Producer(m));
        producerList.add(new Producer(m));
        producerList.add(new Producer(m));
        consumerList.add(new Consumer(m));
        consumerList.add(new Consumer(m));
        consumerList.add(new Consumer(m));

        for(Producer p : producerList){
            p.start();
            p.join();
        }
        for(Consumer p : consumerList){
            p.start();
            p.join();
        }
    }
}


