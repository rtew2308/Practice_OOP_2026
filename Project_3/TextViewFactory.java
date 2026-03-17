/**
 * Конкретна фабрика для створення текстового відображення.
 */
public class TextViewFactory implements ViewFactory {

    @Override
    public ResultView createView() {
        return new TextResultView();
    }
}