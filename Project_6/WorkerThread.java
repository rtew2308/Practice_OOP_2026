/**
 * Робочий потік.
 */
public class WorkerThread extends Thread {

    private TaskQueue queue;

    public WorkerThread(TaskQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Command cmd = queue.getTask();
                cmd.execute();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}