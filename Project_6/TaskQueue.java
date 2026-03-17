import java.util.LinkedList;
import java.util.Queue;

/**
 * Потокобезпечна черга задач.
 */
public class TaskQueue {

    private Queue<Command> queue = new LinkedList<>();

    public synchronized void addTask(Command command) {
        queue.add(command);
        notify(); // повідомляємо потік
    }

    public synchronized Command getTask() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // очікуємо задачі
        }
        return queue.poll();
    }
}