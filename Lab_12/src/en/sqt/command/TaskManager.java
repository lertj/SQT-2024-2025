package en.sqt.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<ITask> commands = new ArrayList<>();

    void addCommand(ITask task){
        commands.add(task);
    }

    void executeCommand(){
        if(commands.size() > 0){
            ITask task = commands.get(0);
            task.executeTask();
            commands.remove(task);
        }
    }
}
