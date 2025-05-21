package en.sqt.command;

public class SyncModule implements IphoneModule{
    @Override
    public void doSomething(String thing) {
        System.out.println("Syncing to server " + thing);
    }
}
