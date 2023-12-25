import java.util.Scanner;

public class powerexample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Input number or 0 to quit");
            int value = Integer.valueOf(reader.nextLine());
            if(value < 0){
                System.out.println("Unsuitable value!");
            }else if(value > 0){
                System.out.println("Your value square is " + value*value);
            }
            else{
                break;
            }
        }
        System.out.println("Thank you!");
    }
}
