import java.util.Scanner;

public class UserDetails {
    private String realUsername = "brian";
    private String realPassword = "spam";
    private Scanner scanner = new Scanner(System.in);

    public UserDetails(){

    }

    public String getUserName() {
        System.out.println("Please enter username");
        String username = scanner.next();
        return username;
    }

    public String getPassword() {
        System.out.println("Please enter password");
        String password = scanner.next();
        return password;
    }

    public void loginRequest(String user, String pass){
        if(user.equals(realUsername) && pass.equals(realPassword)){
            System.out.println("Welcome user " + realUsername);
        }else{
            System.out.println("Login attempt failed. Please try again");
        }

    }

}
