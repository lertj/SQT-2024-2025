package ase.en.sqt.models;

public class SUV extends Car{
    int weight;
    public SUV(String model, int year, String brand, String color) {
        super(model, year, brand, color);
    }

    @Override
    public void move() {
        System.out.println("The SUV is moving!");
    }
}
