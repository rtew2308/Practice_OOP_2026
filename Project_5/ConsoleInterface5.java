import java.util.Scanner;

/**
 * Діалоговий інтерфейс користувача з командами.
 */
public class ConsoleInterface5 {

    public static ResultRepository5 run() {

        ResultRepository5 repository = new ResultRepository5();
        CommandManager manager = CommandManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n1 - Додати результат");
            System.out.println("2 - Undo");
            System.out.println("3 - Показати результати");
            System.out.println("4 - Вийти");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Маса: ");
                    double m = scanner.nextDouble();
                    System.out.print("Швидкість: ");
                    double v = scanner.nextDouble();

                    EnergyData5 data = new EnergyData5(m, v);
                    new KineticEnergySolver5(data).calculate();

                    Command cmd = new AddResultCommand(repository, data);
                    manager.executeCommand(cmd);
                    break;

                case 2:
                    manager.undo();
                    break;

                case 3:
                    repository.getResults().forEach(System.out::println);
                    break;

                case 4:
                    exit = true;
                    break;
            }
        }

        return repository;
    }
}