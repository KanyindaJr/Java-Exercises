import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message here: ");
        String message = scanner.nextLine();
        System.out.println(message);
    }
}