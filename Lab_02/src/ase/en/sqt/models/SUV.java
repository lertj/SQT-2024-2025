package ase.en.sqt.models;

public class SUV extends Car{
    int weight;
    public SUV(String model, int year, String brand, String color, int weight) {
        super(model, year, brand, color);
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("The SUV is moving!");
    }
}