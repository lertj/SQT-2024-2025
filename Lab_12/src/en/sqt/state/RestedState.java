package en.sqt.state;

public class RestedState extends ISimsState{
    Sims sims;

    public RestedState(Sims sims) {
        this.sims = sims;
    }

    @Override
    public void interact() {
        System.out.println("Is talking normally");
    }

    @Override
    public void sleep(Sims sims) {
        sims.rest(8);
        if(sims.energyLevel > 10){
            sims.setState(new WellRestedState());
        }
    }

    @Override
    public void skipANight() {
        sims.getTired(8);
        if(sims.energyLevel < 4){
            sims.setState(new TiredState());
        }
    }

    @Override
    public void drinkCoffee() {

    }
}
