public class Producer extends Thread {
    private Mediator mediator;
    private int id;
    private static int n = 0;

    public Producer(Mediator m){
        mediator = m;
        id = n++;
    }

    @Override
    public void run(){

           mediator.storeMessage("The message from thread-"+ id + ": " + (int)(Math.random()*100));


    }
}
