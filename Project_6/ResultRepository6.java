import java.util.ArrayList;
import java.util.List;

/**
 * Колекція результатів.
 */
public class ResultRepository6 {

    private List<EnergyData6> results = new ArrayList<>();

    public synchronized void addResult(EnergyData6 data) {
        results.add(data);
    }

    public List<EnergyData6> getResults() {
        return results;
    }
}