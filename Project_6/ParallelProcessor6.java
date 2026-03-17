import java.util.List;

/**
 * Паралельна обробка колекції.
 */
public class ParallelProcessor6 {

    /**
     * Пошук максимуму
     */
    public static double findMax(List<EnergyData6> list) {
        return list.parallelStream()
                .mapToDouble(EnergyData6::getEnergy)
                .max()
                .orElse(0);
    }

    /**
     * Пошук мінімуму
     */
    public static double findMin(List<EnergyData6> list) {
        return list.parallelStream()
                .mapToDouble(EnergyData6::getEnergy)
                .min()
                .orElse(0);
    }

    /**
     * Середнє значення
     */
    public static double findAverage(List<EnergyData6> list) {
        return list.parallelStream()
                .mapToDouble(EnergyData6::getEnergy)
                .average()
                .orElse(0);
    }
}