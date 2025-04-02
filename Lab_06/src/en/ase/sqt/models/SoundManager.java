package en.ase.sqt.models;

import en.ase.sqt.interfaces.ISoundManager;

public class SoundManager implements ISoundManager {
    private static SoundManager instance;

    static{
        instance  = new SoundManager();
    }

    public int volume;

    private SoundManager(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sound Manager!");
    }

    private SoundManager(int volume) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.volume = volume;
        System.out.println("Sound Manager!");
    }

    public static SoundManager getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void changeVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SoundManager{" +
                "volume=" + volume +
                '}';
    }
}
