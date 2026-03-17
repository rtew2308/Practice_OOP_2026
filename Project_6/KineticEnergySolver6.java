/**
 * Обчислення енергії.
 */
public class KineticEnergySolver6 {

    private EnergyData6 data;

    public KineticEnergySolver6(EnergyData6 data) {
        this.data = data;
    }

    public void calculate() {
        double energy = (data.getMass() * Math.pow(data.getVelocity(), 2)) / 2;
        data.setEnergy(energy);
    }
}