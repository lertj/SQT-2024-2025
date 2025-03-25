import en.ase.sqt.models.NetflixAccountEager;
import en.ase.sqt.models.NetflixAccountLazy;
import en.ase.sqt.models.NetflixAccountLazyThreadSafe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NetflixAccountEager user1 = NetflixAccountEager.getInstance();
        NetflixAccountEager user2 = NetflixAccountEager.getInstance();
        NetflixAccountEager user3 = NetflixAccountEager.getInstance();

        for (int i=0; i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    NetflixAccountLazyThreadSafe user = NetflixAccountLazyThreadSafe.getInstance();
                }
            }).start();
        }
    }
}