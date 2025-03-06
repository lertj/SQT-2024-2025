package ase.en.sqt.models;

import ase.en.sqt.interfaces.Moveable;

public class Person implements Moveable {
    @Override
    public void move() {
        System.out.println("This person is moving");
    }
}
