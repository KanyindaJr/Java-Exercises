import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printText();
        String input = reader.nextLine();
        System.out.println("How many times should this input be displayed? ");
        int value = Integer.valueOf(reader.nextLine());
        int count = 0;
        while (count < value) {
            System.out.println(input);
            count++;
        }
    }
    public static void printText() {
        System.out.println("Please enter your input:");
    }
}
