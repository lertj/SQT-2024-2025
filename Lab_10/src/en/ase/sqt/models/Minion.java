package en.ase.sqt.models;

public class Minion extends AbstractMinion {

    public Minion(String name, String occupation) {
        super(name, occupation);
    }

    @Override
    public void sayName() {
        System.out.println("minionName: " + this.name);
    }

    @Override
    public void eat(String food) {
        System.out.println("the minion" + this.name + "is eating " + food);
    }

    @Override
    public void run() {
        System.out.println("the minion " + name +" started running");
    }

    @Override
    public void addMinion(AbstractMinion minion) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteMinion(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractMinion getMinion(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Minion{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
