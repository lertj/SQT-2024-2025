package ase.en.sqt;

import ase.en.sqt.interfaces.Moveable;
import ase.en.sqt.models.Car;
import ase.en.sqt.models.Person;
import ase.en.sqt.models.SUV;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("notX5", 2000, "BMW", "red");
        Car car2 = new Car("notX6", 2000, "BMW", "red");
        SUV suv1 = new SUV("X5", 2000, "BMW", "red", 300);
        SUV suv2 = new SUV("X6", 2000, "BMW", "red", 350);

//        car1.move();
//        suv1.move();
//        car2.move();
//        suv2.move();

//        Car[] cars = {car1, car2};
//        SUV[] suvs = { suv1, suv2};
//
//        for (int i=0;i<cars.length;i++){
//            cars[i].move();
//        }
//
//        for (int i=0;i<suvs.length;i++){
//            suvs[i].move();
//        }

//        Car[] cars = {car1, car2, suv1, suv2, new Person()};
//        for (int i = 0; i < cars.length; i++) {
//            cars[i].move();
//        }

        Moveable[] moveables = {car1, car2, suv1, suv2, new Person()};
        for (int i = 0; i < moveables.length; i++) {
            moveables[i].move();
        }


    }

}