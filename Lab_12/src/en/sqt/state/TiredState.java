package en.sqt.state;

public class TiredState extends ISimsState{
    Sims sims;
    @Override
    public void interact() {
        System.out.println("Is barely talking");
    }

    @Override
    public void sleep(Sims sims) {
        sims.rest(6);
        if(sims.energyLevel > 8){
            sims.setState(new RestedState(sims));
        }
    }

    @Override
    public void skipANight() {
        //sims.getTired(10);
        System.out.println("Too tired to do anything...");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Barely does anything");
    }
}
