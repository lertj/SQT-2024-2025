package en.sqt.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AObserver {
    protected List<INotify> subscribers = new ArrayList<>();

    abstract public void subscribe(INotify subscriber);
    abstract public void unsubscribe(INotify subscriber);
    abstract public void notifySubscribers();
}
