package en.ase.sqt.models.Factory;

import en.ase.sqt.models.Factory.abstracts.ASound;
import en.ase.sqt.models.Factory.abstracts.ISoundFactory;

public class FactoryMethodSoundV2 implements ISoundFactory {
    @Override
    public ASound getSound(SoundType type, int volume) {
        switch(type){
            case SUPER: return new SuperSound(volume);
            case REGULAR: return new Sound("boomm", volume, false);
            default: throw new UnsupportedOperationException();
        }
    }
}
