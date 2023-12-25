import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       while(true){
        System.out.println("enter a number or enter 0 to quit");
        int number = Integer.valueOf(reader.nextLine());
        if(number ==0){
            break;
        }
        System.out.println("Your number is "+ number);
       } 
       System.out.println("Thank you for your input");
    }
}
