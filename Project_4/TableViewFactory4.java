public class TableViewFactory4 implements ViewFactory {

    private int columnWidth;

    public TableViewFactory4(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    @Override
    public ResultView createView() {
        return new TableResultView4(columnWidth);
    }
}