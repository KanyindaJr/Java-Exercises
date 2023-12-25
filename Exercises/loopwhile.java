import java.util.Scanner;

public class loopwhile {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println(" enter an input: ");
         String getlit = reader.nextLine();

        System.out.println(" how many times should input be displayed?");
        int times = Integer.valueOf(reader.nextLine());
        int count = 0;
        while (count < times) {
                System.out.println(getlit);
                count++;
        }
    }
}