import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас-репозиторій.
 * Зберігає колекцію результатів та дозволяє їх серіалізувати.
 */
public class ResultRepository2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<EnergyData2> results = new ArrayList<>();

    public void addResult(EnergyData2 data) {
        results.add(data);
    }

    public List<EnergyData2> getResults() {
        return results;
    }

    /**
     * Збереження колекції у файл.
     */
    public void save(String filename) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(this);
        out.close();
    }

    /**
     * Відновлення колекції з файлу.
     */
    public static ResultRepository2 load(String filename)
            throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        ResultRepository2 repo = (ResultRepository2) in.readObject();
        in.close();
        return repo;
    }
}