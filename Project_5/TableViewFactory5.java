public class TableViewFactory5 implements ViewFactory {

    private int columnWidth;

    public TableViewFactory5(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    @Override
    public ResultView createView() {
        return new TableResultView5(columnWidth);
    }
}