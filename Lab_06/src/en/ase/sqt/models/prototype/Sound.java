package en.ase.sqt.models.prototype;

public class Sound implements Cloneable{
    String soundEffect;
    int[] frequencies;

    public Sound(String soundEffect) throws InterruptedException  {
        Thread.sleep(3000);
        this.soundEffect = soundEffect;
        System.out.println("Object created!");
    }

    void playSound(){
        System.out.println(this.soundEffect);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
