package en.ase.models.proxy;

public class LoginProxy implements Loginable{
    private int noAttempts = 0;
    private Loginable loginModule;


    public LoginProxy(Loginable loginModule) {
        this.loginModule = loginModule;
    }

    @Override
    public void login(String user, String pass) {
        if(noAttempts <3){
            loginModule.login(user, pass);
        }
        noAttempts++;
    }
}
