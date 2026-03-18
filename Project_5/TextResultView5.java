/**
 * Просте текстове відображення.
 */
public class TextResultView4 implements ResultView {

    /**
     * Overriding
     */
    @Override
    public void display(ResultRepository5 repository) {

        for (EnergyData5 data : repository.getResults()) {
            display(data);
        }
    }

    /**
     * Overloading
     */
    public void display(EnergyData5 data) {
        System.out.println(data);
    }
}