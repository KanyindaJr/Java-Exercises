import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter value");
        int value = Integer.valueOf(reader.nextLine());
        if (value % 2 ==0){
            System.out.println(" value is even");
        }else {
            System.out.println("value is odd");
        }
    }
}
