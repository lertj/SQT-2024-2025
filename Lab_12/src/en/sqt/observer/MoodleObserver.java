package en.sqt.observer;

public class MoodleObserver extends AObserver{
    @Override
    public void subscribe(INotify subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(INotify subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(INotify s : this.subscribers){
            s.pushNotification();
        }
    }

    void triggerEvent(){
        //...
    }
}
