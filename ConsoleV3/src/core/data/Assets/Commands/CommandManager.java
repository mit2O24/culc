package core.data.Assets.Commands;



import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private static final Map<String, CommandRuner> commands = new HashMap<>();
    
    public static void registerCommand(String name, CommandRuner runner) {
        commands.put(name, runner);
    }
    




    
    public static void executeCommand(String input) {
        String[] parts = input.split(" ", 2);
        String commandName = parts[0].substring(1); // убираем "/"
        
        CommandRuner runner = commands.get(commandName);
        System.err.println(runner);
        if (runner != null) {
            String args = parts.length > 1 ? parts[1] : "";
            runner.execute(args);
        } else {
            System.out.println("Command not found: " + commandName);
        }
    }
}