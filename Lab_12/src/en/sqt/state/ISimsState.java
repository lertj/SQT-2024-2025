package en.sqt.state;

public abstract class ISimsState {
    abstract public void interact(); //first approach
    abstract public void sleep(Sims sims); //second approach
    abstract public void skipANight();
    abstract public void drinkCoffee();

}
