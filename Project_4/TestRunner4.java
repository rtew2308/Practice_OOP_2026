import java.util.Scanner;

/**
 * Тестування основної функціональності.
 */
public class TestRunner4 {

    public static void main(String[] args) {

        ResultRepository4 repository = ConsoleInterface4.run();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть тип відображення:");
        System.out.println("1 - Текст");
        System.out.println("2 - Таблиця");

        int choice = scanner.nextInt();

        ViewFactory factory;

        if (choice == 1) {
            factory = new TextViewFactory4();
        } else {
            System.out.print("Введіть ширину колонки: ");
            int width = scanner.nextInt();
            factory = new TableViewFactory4(width);
        }

        // Dynamic Method Dispatch
        ResultView view = factory.createView();
        view.display(repository);
    }
}