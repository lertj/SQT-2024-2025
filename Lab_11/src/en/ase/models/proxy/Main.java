package en.ase.models.proxy;

public class Main {
    public static void main(String[] args) {
        LoginModule login = new LoginModule("admin", "1234");
        String[] dictionary = new String[]{"123456", "admin", "root", "12345", "1234"};

        LoginProxy proxy = new LoginProxy(login);

        Loginable productionlogin = proxy;
        for(int i=0;i<dictionary.length; i++){
            productionlogin.login("admin", dictionary[i]);
        }
    }
}
