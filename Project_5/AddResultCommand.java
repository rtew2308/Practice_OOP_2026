/**
 * Конкретна команда — додавання результату.
 */
public class AddResultCommand implements Command {

    private ResultRepository5 repository;
    private EnergyData5 data;

    public AddResultCommand(ResultRepository5 repository, EnergyData5 data) {
        this.repository = repository;
        this.data = data;
    }

    @Override
    public void execute() {
        repository.addResult(data);
    }

    @Override
    public void undo() {
        repository.removeResult(data);
    }
}