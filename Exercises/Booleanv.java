import java.util.Scanner;

public class Booleanv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Boolean Value");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println(value);
    }
}
