package en.ase.sqt.models;

public class NetflixAccountLazy {
    static NetflixAccountLazy instance = null;
    String name;


    private NetflixAccountLazy(String name) {
        this.name = name;
        System.out.println("The account " + this.name + " was created. Lazy");
    }

    public static NetflixAccountLazy getInstance(){
        if(instance==null){
            instance = new NetflixAccountLazy("GenericUser");
        }
        return instance;
    }
}
