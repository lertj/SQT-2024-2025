package en.ase.models.proxy;

public class LoginModule implements Loginable {
    String username;
    String password;

    public LoginModule(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String user, String pass){
        if(this.username.equals(user) && this.password.equals(pass)){
            System.out.println("User " + this.username + " has logged in");
        }else{
            System.out.println("Wrong credentials!");
        }
    }
}
