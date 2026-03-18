/**
 * Тестування командного патерну та Singleton.
 */
public class TestRunner5 {

    public static void main(String[] args) {

        ResultRepository5 repository = ConsoleInterface5.run();

        System.out.println("\nFinal results:");
        repository.getResults().forEach(System.out::println);
    }
}