public class Consumer extends Thread {
    private Mediator mediator;
    private int id;
    private static int n = 0;

    public Consumer(Mediator m){
        mediator = m;
        id = n++;
    }

    @Override
    public void run(){
            try {
                System.out.println("Consumer-" + id + " gets the message: " + mediator.getMessage());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}
