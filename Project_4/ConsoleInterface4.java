import java.util.Scanner;

/**
 * Діалоговий інтерфейс користувача.
 */
public class ConsoleInterface4 {

    public static ResultRepository4 run() {

        Scanner scanner = new Scanner(System.in);
        ResultRepository4 repository = new ResultRepository4();

        System.out.print("How many calculations should be performed?");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.print("Mass: ");
            double m = scanner.nextDouble();

            System.out.print("Velocity: ");
            double v = scanner.nextDouble();

            EnergyData4 data = new EnergyData4(m, v);
            KineticEnergySolver4 solver = new KineticEnergySolver4(data);
            solver.calculate();

            repository.addResult(data);
        }

        return repository;
    }
}