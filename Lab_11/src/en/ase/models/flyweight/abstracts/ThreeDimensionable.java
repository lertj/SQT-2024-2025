package en.ase.models.flyweight.abstracts;

import en.ase.models.flyweight.models.ThreeDimensionalPoint;

import java.util.List;

public interface ThreeDimensionable {
    void renderObject(List<ThreeDimensionalPoint> points, String color);
}
