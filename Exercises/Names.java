import java.util.ArrayList;
import java.util.Scanner;


public class Names {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println(" Enter name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                list.add(name);
            }
                System.out.println(" the names are: "+ list.get(3));
             }
           }
}
