/**
 * Табличне відображення результатів.
 */
public class TableResultView4 extends TextResultView4 {

    private int columnWidth;

    public TableResultView4(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    /**
     * Overriding (заміщення)
     */
    @Override
    public void display(ResultRepository4 repository) {

        printLine();
        System.out.printf("| %-" + columnWidth + "s | %-" + columnWidth + "s | %-" + columnWidth + "s |\n",
                "Mass", "Velocity", "Energy");
        printLine();

        for (EnergyData4 data : repository.getResults()) {
            System.out.printf("| %-" + columnWidth + "f | %-" + columnWidth + "f | %-" + columnWidth + "f |\n",
                    data.getMass(),
                    data.getVelocity(),
                    data.getEnergy());
        }

        printLine();
    }

    private void printLine() {
        System.out.println("-".repeat(columnWidth * 3 + 10));
    }
}