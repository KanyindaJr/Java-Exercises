import java.util.Scanner;

public class SecondsinaDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days");
       int days = Integer.valueOf(scanner.nextLine());
        System.out.println("There are "+ (days*24*60*60)+"  Seconds in "+ days +" day(s)" );
    }
}
