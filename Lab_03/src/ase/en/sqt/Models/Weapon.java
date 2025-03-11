package ase.en.sqt.Models;

public abstract class Weapon {
    String name;
    int cost;

    public Weapon(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
