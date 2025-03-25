package en.ase.sqt.models;

public class NetflixAccountEager {
    static NetflixAccountEager instance = new NetflixAccountEager("GenericUser");
    String name;


    private NetflixAccountEager(String name) {
        this.name = name;
        System.out.println("The account " + this.name + " was created.");
    }

    public static NetflixAccountEager getInstance(){
        return instance;
    }
}
