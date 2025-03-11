package ase.en.sqt.Models;

import ase.en.sqt.Interfaces.IDefend;

public class WarriorCharacter extends GameCharacter  implements IDefend {
    Weapon secondaryWeapon = null;

    public WarriorCharacter(String name, int hitPoints, int healthPoints, String weaponName, String secondaryWeaponName) throws Exception {
        super(name, hitPoints, healthPoints, weaponName);
        this.secondaryWeapon = new MagicalStaff(secondaryWeaponName, "Boo!", 9);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("I'm also attacking with " + this.secondaryWeapon.name + " and I'm dealing " + hitPoints + " dmg.");
    }

    @Override
    public void defend() {
        System.out.println("I am defending myself.");
    }
}
