package en.ase.sqt.models;

import java.util.ArrayList;
import java.util.List;

public class MinionHorde extends AbstractMinion {
    List<AbstractMinion> list = new ArrayList<>();

    public MinionHorde(String name, String occupation) {
        super(name, occupation);
    }

    @Override
    public void sayName() {
        System.out.println("The Horde: ");
        list.forEach( m -> m.sayName());
    }

    @Override
    public void eat(String food) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void run() {
        System.out.println("The minions are running");
        for (AbstractMinion m : list){
            if(m instanceof Minion){
                m.run();
            }
        }
    }

    @Override
    public void addMinion(AbstractMinion minion) {
        list.add(minion);
        System.out.println("Minion was added");
    }

    @Override
    public void deleteMinion(int index) {
        list.remove(index);
        System.out.println("Minion was removed");
    }

    @Override
    public AbstractMinion getMinion(String name) {
        for(AbstractMinion m : list){
            if(m instanceof MinionHorde){
                return m.getMinion(name);
            }
            else if (m instanceof Minion && m.name.equals(name)){
                return m;
            }
        }
        return null;
    }
}
