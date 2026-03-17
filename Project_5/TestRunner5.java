/**
 * Тестування командного патерну та Singleton.
 */
public class TestRunner5 {

    public static void main(String[] args) {

        ResultRepository5 repository = ConsoleInterface5.run();

        System.out.println("\nФінальні результати:");
        repository.getResults().forEach(System.out::println);
    }
}