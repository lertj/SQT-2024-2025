import en.ase.sqt.models.Minion;
import en.ase.sqt.models.MinionHorde;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Minion m1 = new Minion("Mihnea", "banana gatherer");
        m1.run();
        Minion m2 = new Minion("Andrei", "banana gatherer");
        Minion m3 = new Minion("Rada", "man");

//        List<Minion> minions = new ArrayList<>();
//        minions.add(m1);
//        minions.add(m2);
//        minions.add(m3);
//        for(Minion m : minions){
//            m.run();
//        }
        //without composite


        //With composite
        MinionHorde horde1 = new MinionHorde("kingdom", "everything");
        MinionHorde horde2 = new MinionHorde("engineers", "engineering");
        horde2.addMinion(m2);
        horde2.addMinion(m3);
        horde1.addMinion(m1);
        horde1.addMinion(horde2);

        horde1.sayName();
        horde1.run();
        System.out.println("===========");
        horde2.run();

        System.out.println(horde1.getMinion("Mihnea"));
        System.out.println(horde1.getMinion("Andrei"));
    }
}