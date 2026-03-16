public class EnergyCalculator {
    private EnergyData data;

    public EnergyCalculator(EnergyData data) {
        this.data = data;
    }

    public void calculate() {
        double energy = (data.getMass() * Math.pow(data.getVelocity(), 2)) / 2;
        data.setKineticEnergy(energy);
        int binaryEnergy = (int) energy;
        data.setBinaryRepresentation(Integer.toBinaryString(binaryEnergy));
    }
}