package en.sqt.observer;

public class Phone implements INotify {

    @Override
    public void pushNotification() {
        System.out.println("Phones were notified");
    }
}
