/**
 * Текстове відображення результатів.
 */
public class TextResultView implements ResultView {

    @Override
    public void display(EnergyData2 data) {
        System.out.println("=== Result ===");
        System.out.println(data);
        System.out.println("==============");
    }
}