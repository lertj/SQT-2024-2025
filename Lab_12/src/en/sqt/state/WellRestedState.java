package en.sqt.state;

public class WellRestedState extends ISimsState{
    Sims sims;
    @Override
    public void interact() {
        System.out.println("Is talking energetically");
    }

    @Override
    public void sleep(Sims sims) {
        sims.rest(8);
    }

    @Override
    public void skipANight() {
        this.sims.getTired(6);
    }

    @Override
    public void drinkCoffee() {
        this.sims.rest(1);
    }
}
