import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String message = scanner.nextLine();
        System.out.println("Hi " +message);
    }
}