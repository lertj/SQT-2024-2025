package ase.en.sqt.Models;

public class MagicalStaff extends Weapon {
    String name;
    String spells;

    public MagicalStaff(String name, String spells, int cost) {
        super(name,cost);
        this.name = name;
        this.spells = spells;
    }
}
