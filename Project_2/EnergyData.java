import java.io.Serializable;

/**
 * Клас для зберігання параметрів та результатів обчислення кінетичної енергії.
 * Реалізує інтерфейс Serializable для можливості збереження об'єкта у файл.
 */
public class EnergyData implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Маса тіла */
    private double mass;

    /** Швидкість тіла */
    private double velocity;

    /** Обчислена кінетичної енергії */
    private double energy;

    /**
     * transient поле не буде серіалізоване.
     * Використовується для тимчасових обчислень.
     */
    private transient String binaryRepresentation;

    /**
     * Конструктор
     */
    public EnergyData(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }

    // Гетери та сетери

    public double getMass() {
        return mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public String getBinaryRepresentation() {
        return binaryRepresentation;
    }

    public void setBinaryRepresentation(String binaryRepresentation) {
        this.binaryRepresentation = binaryRepresentation;
    }

    /**
     * Перевизначення toString()
     */
    @Override
    public String toString() {
        return "Mass=" + mass +
                ", Velocity=" + velocity +
                ", Energy=" + energy +
                ", Binary=" + binaryRepresentation;
    }
}