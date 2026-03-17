/**
 * Обчислення кінетичної енергії.
 */
public class KineticEnergySolver5 {

    private EnergyData5 data;

    public KineticEnergySolver5(EnergyData5 data) {
        this.data = data;
    }

    public void calculate() {
        double energy = (data.getMass() * Math.pow(data.getVelocity(), 2)) / 2;
        data.setEnergy(energy);
        int intPart = (int) energy;
        data.setBinaryRepresentation(Integer.toBinaryString(intPart));
    }
}