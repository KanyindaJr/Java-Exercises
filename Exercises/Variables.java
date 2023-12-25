import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Value: ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Your value is " + value);
    }
}
