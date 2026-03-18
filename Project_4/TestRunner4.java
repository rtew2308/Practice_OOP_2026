import java.util.Scanner;

/**
 * Тестування основної функціональності.
 */
public class TestRunner4 {

    public static void main(String[] args) {

        ResultRepository4 repository = ConsoleInterface4.run();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a display type:");
        System.out.println("1 - Text");
        System.out.println("2 - Table");

        int choice = scanner.nextInt();

        ViewFactory factory;

        if (choice == 1) {
            factory = new TextViewFactory4();
        } else {
            System.out.print("Enter column width: ");
            int width = scanner.nextInt();
            factory = new TableViewFactory4(width);
        }

        // Dynamic Method Dispatch
        ResultView view = factory.createView();
        view.display(repository);
    }
}