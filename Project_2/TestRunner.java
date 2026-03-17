/**
 * Клас для тестування обчислень та серіалізації.
 */
public class TestRunner {

    public static void main(String[] args) {

        try {

            // Створення даних
            EnergyData data = new EnergyData(10, 5);

            // Обчислення
            KineticEnergySolver solver = new KineticEnergySolver(data);
            solver.calculate();

            System.out.println("До серіалізації:");
            System.out.println(data);

            // Збереження
            SerializationDemo.save(data, "energy.dat");

            // Обнулюємо binary щоб показати різницю
            data.setBinaryRepresentation(null);

            // Завантаження
            EnergyData loaded = SerializationDemo.load("energy.dat");

            System.out.println("\nПісля десеріалізації:");
            System.out.println(loaded);

            System.out.println("\nЗверни увагу:");
            System.out.println("transient поле binaryRepresentation не зберігається!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}