/**
 * Просте текстове відображення.
 */
public class TextResultView4 implements ResultView {

    /**
     * Overriding
     */
    @Override
    public void display(ResultRepository4 repository) {

        for (EnergyData4 data : repository.getResults()) {
            display(data);
        }
    }

    /**
     * Overloading
     */
    public void display(EnergyData4 data) {
        System.out.println(data);
    }
}