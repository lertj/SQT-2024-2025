package en.ase.sqt.models.prototype;

import java.util.HashMap;
import java.util.Map;

public class SoundPrototypeFactory {
    private static Map<String, Sound> prototypes = new HashMap<>();

    static{
        try {
            prototypes.put("BOOM", new Sound("boom"));
            prototypes.put("ftaang", new Sound("ftaang"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Sound getPrototype(SoundType type) throws CloneNotSupportedException {
        switch(type){
            case NOTIFICATION: return (Sound) prototypes.get("ftaang").clone();
            case APP: return (Sound) prototypes.get("BOOM").clone();
            default: throw new UnsupportedOperationException();
        }
    }
}
