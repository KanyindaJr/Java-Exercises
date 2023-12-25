import java.util.Scanner;

public class elsestatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your value");
        double value = Double.valueOf(scanner.nextLine());
        if ( value >= 0){
            System.out.println(" value is positive");
        } else{
            System.out.println("value is negative");
        }
    }
}
