package ase.en.sqt.models;

import ase.en.sqt.interfaces.Moveable;

public class Car implements Moveable {
    private String model;
    private int yearOfManufacture;
    private String carBrand;
    private String colorOfCar;
    private boolean isInMotion;

    public Car(String model, int year, String brand, String color) {
        this.model = model;
        this.yearOfManufacture = year;
        this.carBrand = brand;
        this.colorOfCar = color;
        this.isInMotion = false;
    }

    @Override
    public void move(){
        System.out.println("The car is moving!");
        this.isInMotion = true;
    }

    public void startEngine() {
        if (!isInMotion) {
            System.out.println("Engine started!");
        }
    }

    private void stopEngine() {
        System.out.println("Car is stopped.");
        isInMotion = false;
    }

}