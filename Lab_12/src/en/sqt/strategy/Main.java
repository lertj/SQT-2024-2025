package en.sqt.strategy;

public class Main {
    public static void main(String[] args) {
        GMaps maps = new GMaps(100, 0);
        Transportable str = new TransportCar();
        maps.setStrategy(str);

        maps.planTrip();

        str = new TransportWalk();
        maps.setStrategy(str);
        maps.planTrip();

        if(maps.money > 50 && maps.time >10){
            maps.setStrategy(new TransportPlane());
        } else if (maps.money > 50 && maps.time <1){
            maps.setStrategy(new Transportable() {
                @Override
                public void transport() {
                    System.out.println("Teleporting...");
                }
            });
        }
        maps.planTrip();
    }
}
