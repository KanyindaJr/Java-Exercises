import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Message Here: ");
        String message = scanner.nextLine();
        System.out.println("How many times should this message be displayed: ");
        int value = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= value; i++) {
            System.out.println(message);
        }
    }
}
