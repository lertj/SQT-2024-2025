import ase.en.sqt.Interfaces.IAttack;
import ase.en.sqt.Models.GameCharacter;
import ase.en.sqt.Models.WarriorCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter mainCharacter = null;
        WarriorCharacter warrior = null;
        try {
            mainCharacter = new GameCharacter("Biciclentiu", 10, 100, "MainWeapon");
            warrior = new WarriorCharacter("Odobasian", 110, 200, "Sword", "Inflation");
        } catch (Exception e) {
            System.out.println("Character could not be created!");
        }
        mainCharacter.attack();
        warrior.attack();

        System.out.println("\n\n\n");

        IAttack[] characters = new GameCharacter[2];
        characters[0] = mainCharacter;
        characters[1] = warrior;
        for(IAttack c : characters){
            c.attack();
        }

    }
}