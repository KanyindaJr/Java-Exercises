import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first =  Integer.valueOf(scanner.nextLine());
        System.out.println("Enter Second Number");
        double second = Double.valueOf(scanner.nextLine());
        double sum;
        sum = first + second;
        System.out.println("The sum is: " + sum + " = "+ first +" + " + second );
    }
}
