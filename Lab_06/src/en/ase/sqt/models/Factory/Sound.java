package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;

public class Sound extends ASound implements Cloneable {
    String soundEffect;
    int volume;
    boolean isMuted;

    Sound(String soundEffect, int volume, boolean isMuted)  {
        this.soundEffect = soundEffect;
        this.volume = volume;
        System.out.println("Object created!");
    }

    public void playSound(){
        System.out.println(this.soundEffect);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
