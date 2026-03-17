import java.io.*;

/**
 * Демонстрація серіалізації та десеріалізації об'єкта.
 */
public class SerializationDemo {

    /**
     * Збереження об'єкта у файл
     */
    public static void save(EnergyData data, String filename) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(filename));
        out.writeObject(data);
        out.close();
    }

    /**
     * Відновлення об'єкта з файлу
     */
    public static EnergyData load(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(filename));
        EnergyData data = (EnergyData) in.readObject();
        in.close();
        return data;
    }
}