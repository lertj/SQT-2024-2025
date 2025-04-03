package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;

public class ExtraSound extends ASound {
    boolean isExtra;

    ExtraSound(int volume, boolean isExtra) {
        this.volume = volume;
    }

    ExtraSound(int volume) {
        this.volume = volume;
    }

    @Override
    public void playSound() {
        System.out.println("Extra sound!!");
    }
}
