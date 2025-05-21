package en.sqt.command;

public class TaskCommand implements ITask{
    String thing;
    IphoneModule executant;

    public TaskCommand(String thing, IphoneModule executant) {
        this.thing = thing;
        this.executant = executant;
    }

    @Override
    public void executeTask() {
        if(executant != null){
            executant.doSomething(thing);
        }
    }
}
