import java.io.Serializable;

/**
 * Модель даних.
 */
public class EnergyData6 implements Serializable {

    private double mass;
    private double velocity;
    private double energy;

    public EnergyData6(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }

    public double getMass() { return mass; }
    public double getVelocity() { return velocity; }
    public double getEnergy() { return energy; }

    public void setEnergy(double energy) { this.energy = energy; }
}