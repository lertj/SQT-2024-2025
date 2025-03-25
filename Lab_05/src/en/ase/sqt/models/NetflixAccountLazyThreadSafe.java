package en.ase.sqt.models;

public class NetflixAccountLazyThreadSafe {
    static NetflixAccountLazyThreadSafe instance = null;
    String name;


    private NetflixAccountLazyThreadSafe(String name) {
        this.name = name;
        System.out.println("The account " + this.name + " was created. threadSafe");
    }

    public static synchronized NetflixAccountLazyThreadSafe getInstance(){
        if(instance==null){
            instance = new NetflixAccountLazyThreadSafe("GenericUser");
        }
        return instance;
    }
}
