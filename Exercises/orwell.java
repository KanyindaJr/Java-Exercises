import java.util.Scanner;

public class orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int value = Integer.valueOf(scanner.nextLine());
        if(value == 1984){
            System.out.println("Orwell");
        }
    }
}
