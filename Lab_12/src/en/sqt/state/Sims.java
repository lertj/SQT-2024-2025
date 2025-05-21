package en.sqt.state;

public class Sims {
    String name;
    int energyLevel;

    ISimsState state;

    public Sims(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.state = new RestedState(this);
    }

    public void interactWithPeople(){
        state.interact();
    }

    public void rest(int energyRecovered){
        this.energyLevel += energyRecovered;
    }

    public void allNighter(){
        state.skipANight();
    }

    public void getTired(int energyUsed){
        this.energyLevel -= energyUsed;
    }

    public void setState(ISimsState state) {
        this.state = state;
    }

    public void sleep(){
        state.sleep(this);
    }
}
