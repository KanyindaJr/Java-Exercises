import java.util.Scanner;

public class equalcommand {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your  password");
        String password = reader.nextLine();
        if (password.equals("413376")){
            System.out.println("Welcome");
        }else if(password.equals("Password")){
            System.out.println("Change your password, this is not safe");
        }else{
            System.out.println("password incorrect!");
        }
    }
}
