package ase.en.sqt.Models;

import ase.en.sqt.Interfaces.IAttack;

public class GameCharacter implements IAttack {
    String name;
    int hitPoints;
    int healthPoints;
    Weapon weapon = null;

    public GameCharacter(String name, int hitPoints, int healthPoints, String weaponName) throws Exception {
        this.name = name;
        this.hitPoints = hitPoints;
        this.healthPoints = healthPoints;
        this.weapon = new PhysicalWeapon(weaponName, 0 ,0);
    }

    public void attack(){
        System.out.println("I'm attacking with " + this.weapon.name + " and I'm dealing " + hitPoints + " dmg.");
    }

}
