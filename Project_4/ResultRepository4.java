import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторій для зберігання колекції результатів.
 */
public class ResultRepository4 implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<EnergyData4> results = new ArrayList<>();

    public void addResult(EnergyData4 data) {
        results.add(data);
    }

    public List<EnergyData4> getResults() {
        return results;
    }
}