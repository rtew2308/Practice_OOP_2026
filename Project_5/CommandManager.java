import java.util.Stack;

/**
 * Singleton менеджер команд.
 */
public class CommandManager {

    private static CommandManager instance;
    private Stack<Command> history = new Stack<>();

    private CommandManager() {}

    public static CommandManager getInstance() {
        if (instance == null) {
            instance = new CommandManager();
        }
        return instance;
    }

    public void executeCommand(Command cmd) {
        cmd.execute();
        history.push(cmd);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command cmd = history.pop();
            cmd.undo();
        } else {
            System.out.println("There are no commands to undo.");
        }
    }
}