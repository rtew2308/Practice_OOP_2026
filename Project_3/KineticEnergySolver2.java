/**
 * Клас для обчислення кінетичної енергії.
 * Використовує агрегування — приймає об'єкт EnergyData.
 */
public class KineticEnergySolver {

    private EnergyData data;

    /**
     * Конструктор з агрегуванням
     */
    public KineticEnergySolver(EnergyData data) {
        this.data = data;
    }

    /**
     * Метод обчислення кінетичної енергії
     */
    public void calculate() {

        double energy = (data.getMass() * Math.pow(data.getVelocity(), 2)) / 2;
        data.setEnergy(energy);

        // Беремо цілу частину
        int integerPart = (int) energy;

        // Переведення у двійкову систему
        String binary = Integer.toBinaryString(integerPart);
        data.setBinaryRepresentation(binary);
    }
}