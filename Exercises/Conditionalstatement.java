import java.util.Scanner;

public class Conditionalstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your speed: ");
        double speed = Double.valueOf(scanner.nextLine());
        if( speed > 120 ){
            System.out.println("Give ticket!");
        }
    }
}
