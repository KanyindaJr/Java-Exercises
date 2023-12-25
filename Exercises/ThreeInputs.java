import java.util.Scanner;

public class ThreeInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String fisrt = scanner.nextLine();
        System.out.println("Enter Your Middle Name: ");
        String second = scanner.nextLine();
        System.out.println("Enter Your Last Name: ");
        String third = scanner.nextLine();
        System.out.println("Your full name is: " + fisrt+" " + second+" " + third);
            }
}
