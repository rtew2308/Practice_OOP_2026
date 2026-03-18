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

            System.out.println("Before serialization:");
            System.out.println(data);

            // Збереження
            SerializationDemo.save(data, "energy.dat");

            // Обнулюємо binary щоб показати різницю
            data.setBinaryRepresentation(null);

            // Завантаження
            EnergyData loaded = SerializationDemo.load("energy.dat");

            System.out.println("\nAfter deserialization:");
            System.out.println(loaded);

            System.out.println("\nNotice:");
            System.out.println("The transient field binaryRepresentation is not saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}