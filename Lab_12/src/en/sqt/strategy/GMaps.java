package en.sqt.strategy;

public class GMaps {
    int time;
    float money; // scenario specific

    Transportable strategy; // dp specific

    public GMaps(float money, int time) {
        this.money = money;
        this.time = time;
    }

    public void setStrategy(Transportable strategy) {
        this.strategy = strategy;
    }

    void planTrip(){
        if(strategy == null){
            throw new UnsupportedOperationException();
        } else{
            strategy.transport();
        }
    }
}
