package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;
import en.ase.sqt.models.Factory.abstracts.ISoundFactory;

public class FactoryMethodSoundV1 implements ISoundFactory {
    @Override
    public ASound getSound(SoundType type, int volume) {
        switch(type){
            case EXTRA: return new ExtraSound(volume);
            case EXTRA_NEW: return new ExtraSound(volume, true);
            default: throw new UnsupportedOperationException();
        }
    }
}
