import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторій для колекції результатів.
 */
public class ResultRepository5 implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<EnergyData5> results = new ArrayList<>();

    public void addResult(EnergyData5 data) {
        results.add(data);
    }

    public void removeResult(EnergyData5 data) {
        results.remove(data);
    }

    public List<EnergyData5> getResults() {
        return results;
    }
}