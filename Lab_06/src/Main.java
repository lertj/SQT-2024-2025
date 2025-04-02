import en.ase.sqt.models.SoundManager;
import en.ase.sqt.models.SoundManagerRegistry;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("The app is starting...");
        System.out.println("The app started...");
        for(int i=0; i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SoundManager sm1 = SoundManager.getInstance();
                }
            }).start();
        }


        SoundManager sm2 = SoundManager.getInstance();
        //sm2.clone();
        //sm2 = new SoundManager();
        //sm2 = new SoundManager(23);


//        System.out.println(sm1);
        sm2.volume = 90;
        System.out.println(sm2);

        SoundManagerRegistry musicSound = SoundManagerRegistry.getInstance( 66, "Music");
        SoundManagerRegistry musicSound2 = SoundManagerRegistry.getInstance( 78, "Music");
        SoundManagerRegistry musicSound3 = SoundManagerRegistry.getInstance( 13, "Music");
        SoundManagerRegistry browserSound = SoundManagerRegistry.getInstance( 99, "Browser");
        System.out.println(musicSound);
        musicSound2.changeVolume(55);
        System.out.println("Changing sound volume for music");
        System.out.println(musicSound);
        System.out.println(musicSound2);
        System.out.println(musicSound3);
        System.out.println(browserSound);

    }
}