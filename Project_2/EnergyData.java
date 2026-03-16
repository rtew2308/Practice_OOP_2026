import java.io.Serializable;

public class EnergyData implements Serializable {

    private double mass;
    private double velocity;
    private double kineticEnergy;

    transient private String binaryRepresentation; // не серіалізуеться тому що є transient

    public EnergyData(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getKineticEnergy() {
        return kineticEnergy;
    }
    public void setKineticEnergy(double kineticEnergy) {
        this.kineticEnergy = kineticEnergy;
    }

    public String getBinaryRepresentation() {
        return binaryRepresentation;
    }
    
}