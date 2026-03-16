import java.io.*;

public class SerializationDemo {

    public static void save(EnergyData data, String filename) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(data);
        oos.close();
    }

    public static EnergyData load(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        EnergyData data = (EnergyData) ois.readObject();
        ois.close();
        return data;
    }
}