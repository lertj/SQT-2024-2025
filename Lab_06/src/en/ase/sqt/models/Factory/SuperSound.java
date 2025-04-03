package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;

public class SuperSound extends ASound {

    SuperSound(int volume) {
        this.volume = volume;
    }

    @Override
    public void playSound() {
        System.out.println("Super sound!");
    }
}
