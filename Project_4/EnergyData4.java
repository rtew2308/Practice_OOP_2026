import java.io.Serializable;

/**
 * Модель даних кінетичної енергії.
 */
public class EnergyData4 implements Serializable {

    private static final long serialVersionUID = 1L;

    private double mass;
    private double velocity;
    private double energy;

    private transient String binaryRepresentation;

    public EnergyData4(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }

    public double getMass() { return mass; }
    public double getVelocity() { return velocity; }
    public double getEnergy() { return energy; }

    public void setEnergy(double energy) { this.energy = energy; }

    public String getBinaryRepresentation() { return binaryRepresentation; }
    public void setBinaryRepresentation(String binary) {
        this.binaryRepresentation = binary;
    }

    @Override
    public String toString() {
        return "Mass=" + mass +
                ", Velocity=" + velocity +
                ", Energy=" + energy +
                ", Binary=" + binaryRepresentation;
    }
}