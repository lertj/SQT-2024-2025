package en.ase.sqt.models.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Sound s = new Sound("Ftaaang");
        Sound s1 = (Sound) s.clone();
        Sound s2 = (Sound) s.clone();
        s.playSound();
        s1.playSound();
        s2.playSound();

        Sound s3 = SoundPrototypeFactory.getPrototype(SoundType.APP);
        s3 = SoundPrototypeFactory.getPrototype(SoundType.APP);
        s3 = SoundPrototypeFactory.getPrototype(SoundType.APP);
        s3 = SoundPrototypeFactory.getPrototype(SoundType.APP);
        s3 = SoundPrototypeFactory.getPrototype(SoundType.APP);
        s3.playSound();
    }
}
