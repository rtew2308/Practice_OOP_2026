import java.util.List;

/**
 * Тестування.
 */
public class TestRunner6 {

    public static void main(String[] args) {

        ResultRepository6 repo = ConsoleInterface6.run();

        List<EnergyData6> list = repo.getResults();

        System.out.println("\n=== Статистика ===");
        System.out.println("Max: " + ParallelProcessor6.findMax(list));
        System.out.println("Min: " + ParallelProcessor6.findMin(list));
        System.out.println("Avg: " + ParallelProcessor6.findAverage(list));
    }
}