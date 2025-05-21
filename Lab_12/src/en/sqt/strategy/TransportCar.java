package en.sqt.strategy;

public class TransportCar implements Transportable{
    @Override
    public void transport() {
        System.out.println("Driving...");
    }
}
