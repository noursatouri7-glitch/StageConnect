public class Authentification {

    public boolean login(String email, String password) {
        if(email.equals("admin@gmail.com") && password.equals("1234")) {
            return true;
        }
        return false;
    }
}