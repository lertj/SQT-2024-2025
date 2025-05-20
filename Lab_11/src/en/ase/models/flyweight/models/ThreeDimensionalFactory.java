package en.ase.models.flyweight.models;

import en.ase.models.flyweight.abstracts.ThreeDimensionable;

import java.util.HashMap;
import java.util.Map;

public class ThreeDimensionalFactory {
    private static Map<String, ThreeDimensionalObject> threeDobjects = new HashMap<>();

//    static{
//        threeDobjects.put("stone.3d", new ThreeDimensionalObject("stone.3d", "unevenFilter"));
//        threeDobjects.put("tree.3d", new ThreeDimensionalObject("tree.3d", "tallFilter"));
//        threeDobjects.put("bridge.3d", new ThreeDimensionalObject("bridge.3d", "archingFilter"));
//    }

    public static ThreeDimensionable get3DObject(String model, String filter){
        ThreeDimensionalObject three3Dobj = threeDobjects.get(model);

        if(three3Dobj == null){
            three3Dobj = new ThreeDimensionalObject(model, filter);
            threeDobjects.put(model,three3Dobj);
        }


        return three3Dobj;
    }
}
