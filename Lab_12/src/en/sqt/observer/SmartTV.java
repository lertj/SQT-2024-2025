package en.sqt.observer;

public class SmartTV implements INotify {

    @Override
    public void pushNotification() {
        System.out.println("TVs were notified");
    }
}
