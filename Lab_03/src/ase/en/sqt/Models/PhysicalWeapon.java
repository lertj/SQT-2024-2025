package ase.en.sqt.Models;

public class PhysicalWeapon extends Weapon {

    float condition;


    public PhysicalWeapon(String name, float condition, int cost) throws Exception {
        super(name, cost);
        this.setName(name);
        this.condition = condition;
        this.cost = cost;
    }

    public void setName(String name) throws Exception {
        if(name.length() < 2){
            throw new Exception("The weapon name is too short");
        }
        this.name = name;
    }
}
