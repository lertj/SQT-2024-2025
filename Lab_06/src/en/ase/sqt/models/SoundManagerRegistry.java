package en.ase.sqt.models;

import en.ase.sqt.interfaces.ISoundManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SoundManagerRegistry implements ISoundManager {
    private static Map<String,SoundManagerRegistry> instances;

    static{
        instances  = new HashMap<>();
    }

    public int volume;
    String soundType;

    private SoundManagerRegistry(){
        System.out.println("Sound Manager!");
    }

    private SoundManagerRegistry(int volume, String soundType) {
        this.volume = volume;
        this.soundType = soundType;
        System.out.println("Sound Manager!");
    }

    public static SoundManagerRegistry getInstance(int volume, String soundType) {
        SoundManagerRegistry manager = instances.get(soundType);
        if(manager == null){
            manager = new SoundManagerRegistry(volume,soundType);
            instances.put(soundType, manager);
        }
        return manager;
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
        return "SoundManagerRegistry{" +
                "volume=" + volume +
                ", soundType='" + soundType + '\'' +
                '}';
    }
}
