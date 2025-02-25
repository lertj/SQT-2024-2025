package ase.en.sqt;

import ase.en.sqt.models.Car;
import ase.en.sqt.models.SUV;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("notX5", 2000, "BMW", "red");
        SUV suv = new SUV("X5", 2000, "BMW", "red");

        car.move();
        suv.move();

    }

}
