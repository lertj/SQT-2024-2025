package en.ase.models.flyweight.models;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ThreeDimensionalPoint> pixels = new ArrayList<>();
        for(int i=0; i<5000;i++){
            pixels.add(new ThreeDimensionalPoint(i,i*2, i*3));
        }

        ThreeDimensionalObject stone = new ThreeDimensionalObject("stone.3d", "unevenFilter");
        stone.renderObject(pixels, "dark gray");
        ThreeDimensionalFactory.get3DObject("tree", "tallFilter").renderObject(pixels,"green");

    }
}
