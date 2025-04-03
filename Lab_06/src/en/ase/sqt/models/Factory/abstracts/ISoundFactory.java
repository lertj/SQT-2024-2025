package en.ase.sqt.models.Factory.abstracts;

import en.ase.sqt.models.Factory.SoundType;

public interface ISoundFactory {
    ASound getSound(SoundType type, int volume);
}
