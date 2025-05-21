package en.sqt.command;

public class UpdateModule implements IphoneModule{
    @Override
    public void doSomething(String thing) {
        System.out.println("Updating to version " + thing);
    }
}
