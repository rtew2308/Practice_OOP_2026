/**
 * Тестування Factory Method та колекції.
 */
public class TestRunner2 {

    public static void main(String[] args) {

        try {

            ResultRepository2 repository = new ResultRepository2();

            EnergyData2 d1 = new EnergyData2(10, 5);
            KineticEnergySolver2 solver1 = new KineticEnergySolver2(d1);
            solver1.calculate();
            repository.addResult(d1);

            EnergyData2 d2 = new EnergyData2(7, 3);
            KineticEnergySolver2 solver2 = new KineticEnergySolver2(d2);
            solver2.calculate();
            repository.addResult(d2);

            repository.save("results.dat");

            ResultRepository2 loaded = ResultRepository2.load("results.dat");

            ViewFactory factory = new TextViewFactory();
            ResultView view = factory.createView();

            for (EnergyData2 data : loaded.getResults()) {
                view.display(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}