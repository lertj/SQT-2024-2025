package en.sqt.strategy;

public class TransportPlane implements Transportable{
    @Override
    public void transport() {
        System.out.println("Flying...");
    }
}
