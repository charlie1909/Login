public class LoginApp {

    public static void main (String[] args){
        UserDetails userdetails = new UserDetails();
        String username = userdetails.getUserName();
        String password = userdetails.getPassword();
        userdetails.loginRequest(username, password);
    }
}
