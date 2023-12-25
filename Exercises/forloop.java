import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = Integer.valueOf(reader.nextLine());

        for (int i = value; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
