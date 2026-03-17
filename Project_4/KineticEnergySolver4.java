/**
 * Клас обчислення.
 */
public class KineticEnergySolver4 {

    private EnergyData4 data;

    public KineticEnergySolver4(EnergyData4 data) {
        this.data = data;
    }

    /**
     * Обчислення кінетичної енергії.
     */
    public void calculate() {

        double energy = (data.getMass() * Math.pow(data.getVelocity(), 2)) / 2;
        data.setEnergy(energy);

        int intPart = (int) energy;
        data.setBinaryRepresentation(Integer.toBinaryString(intPart));
    }
}