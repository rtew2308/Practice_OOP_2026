/**
 * Команда додавання результату.
 */
public class AddResultCommand6 implements Command {

    private ResultRepository6 repository;
    private EnergyData6 data;

    public AddResultCommand6(ResultRepository6 repository, EnergyData6 data) {
        this.repository = repository;
        this.data = data;
    }

    @Override
    public void execute() {
        repository.addResult(data);
    }
}