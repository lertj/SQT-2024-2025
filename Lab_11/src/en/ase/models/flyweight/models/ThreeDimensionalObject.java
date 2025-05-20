package en.ase.models.flyweight.models;

import en.ase.models.flyweight.abstracts.ThreeDimensionable;

import java.util.ArrayList;
import java.util.List;

public class ThreeDimensionalObject implements ThreeDimensionable {
    String model;
    String filters; // as many attributes as needed for the problem


    public ThreeDimensionalObject(String model, String filters) {
        this.model = model;
        this.filters = filters;
    }

    @Override
    public void renderObject(List<ThreeDimensionalPoint> pixels, String color) {
        System.out.println("Rendering the model " + model + " with color " + color + " with " + pixels.size() + " points");

    }
}
