import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The purpose of mediator is to pass the messages between consumers and producers
 */

public class Mediator {
    private List synchedList;

    public Mediator() {
        synchedList = Collections.synchronizedList(new LinkedList());
    }

    public synchronized void storeMessage(String message) {
        synchronized (synchedList) {
            synchedList.add(message);
            synchedList.notifyAll();
        }
    }

    public String getMessage() throws InterruptedException {
        synchronized (synchedList) {
            while (synchedList.isEmpty()) {
                synchedList.wait();
            }
            return (String) synchedList.remove(0);
        }
    }
}
