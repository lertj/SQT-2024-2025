package en.sqt.observer;

public class Tablet implements INotify {

    @Override
    public void pushNotification() {
        System.out.println("Tablets were notified");
    }
}
