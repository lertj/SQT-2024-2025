package en.sqt.state;

public class Main {
    public static void main(String[] args) {
        Sims sims = new Sims("Sims1", 10);
        sims.interactWithPeople();
        sims.allNighter();
        sims.interactWithPeople();
        sims.sleep();
        sims.interactWithPeople();
        sims.sleep();
        sims.interactWithPeople();
        sims.sleep();
        sims.interactWithPeople();
    }
}
