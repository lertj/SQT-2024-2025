package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;

public class SoundFactory {

    public static ASound getSound(SoundType type, int volume){
        switch(type){
            case EXTRA: return new ExtraSound(volume);
            case SUPER: return new SuperSound(volume);
            case REGULAR: return new Sound("boomm", volume, false);
            default: throw new UnsupportedOperationException();
        }

    }
}
