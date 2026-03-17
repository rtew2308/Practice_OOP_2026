import java.util.ArrayList;
import java.util.List;

/**
 * Макрокоманда — виконує кілька команд одночасно.
 */
public class MacroCommand implements Command {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    @Override
    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}