package en.ase.sqt.models.Factory.Main;

import en.ase.sqt.models.Factory.*;
import en.ase.sqt.models.Factory.abstracts.ISoundFactory;

public class Main {
    public static void main(String[] args) {
//        Sound s = new Sound("boom", 65);
//        s.playSound();

        ExtraSound s = (ExtraSound) SoundFactory.getSound(SoundType.EXTRA, 80);
        s.playSound();

        Sound sR = (Sound) SoundFactory.getSound(SoundType.REGULAR, 55);
        sR.playSound();

        ISoundFactory soundFactory = new FactoryMethodSoundV1();
        ExtraSound newSound = (ExtraSound) soundFactory.getSound(SoundType.EXTRA, 10);
        newSound.playSound();

        soundFactory = new FactoryMethodSoundV2();
        SuperSound newSuperSound = (SuperSound) soundFactory.getSound(SoundType.SUPER, 11);
        newSuperSound.playSound();
    }
}
