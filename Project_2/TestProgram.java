public class TestProgram {

    public static void main(String[] args) throws Exception {

        EnergyData data = new EnergyData(10, 5);

        EnergyCalculator calculator = new EnergyCalculator(data);
        calculator.calculate();

        System.out.println("Energy: " + data.getKineticEnergy());
        System.out.println("Binary: " + data.getBinaryRepresentation());

        SerializationDemo.save(data, "energy.ser");

        EnergyData restored = SerializationDemo.load("energy.ser");

        System.out.println("\nAfter deserialization:");
        System.out.println("Energy: " + restored.getKineticEnergy());
        System.out.println("Binary (transient): " + restored.getBinaryRepresentation());
    }
}