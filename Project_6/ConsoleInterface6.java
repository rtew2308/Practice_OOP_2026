import java.util.Scanner;

/**
 * Діалоговий інтерфейс.
 */
public class ConsoleInterface6 {

    public static ResultRepository6 run() {

        ResultRepository6 repository = new ResultRepository6();
        TaskQueue queue = new TaskQueue();

        // Створюємо 2 worker потоки
        new WorkerThread(queue).start();
        new WorkerThread(queue).start();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Скільки задач додати: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Маса: ");
            double m = scanner.nextDouble();

            System.out.print("Швидкість: ");
            double v = scanner.nextDouble();

            EnergyData6 data = new EnergyData6(m, v);
            new KineticEnergySolver6(data).calculate();

            queue.addTask(new AddResultCommand6(repository, data));
        }

        try { Thread.sleep(1000); } catch (Exception e) {}

        return repository;
    }
}