package en.sqt.observer;

public class Main {
    public static void main(String[] args) {
        MoodleObserver m = new MoodleObserver();
        m.subscribe(new Phone());
        m.subscribe(new Tablet());
        m.subscribe(new SmartTV());

        m.notifySubscribers();
    }
}
