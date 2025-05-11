package en.ase.sqt.models;

public abstract class AbstractMinion {
    String name;
    String occupation;

    public AbstractMinion(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public abstract void sayName();

    public abstract void eat(String food);

    public abstract void run();

    public abstract void addMinion(AbstractMinion minion);

    public abstract void deleteMinion(int index);

    public abstract AbstractMinion getMinion(String name);

}
