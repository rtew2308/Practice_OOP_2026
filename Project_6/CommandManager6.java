import java.util.Stack;

/**
 * Singleton менеджер команд.
 */
public class CommandManager6 {

    private static CommandManager6 instance;
    private Stack<Command> history = new Stack<>();

    private CommandManager6() {}

    public static CommandManager6 getInstance() {
        if (instance == null) {
            instance = new CommandManager6();
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