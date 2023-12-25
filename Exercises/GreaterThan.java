public class GreaterThan {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 10056;
        if (a >= b && a >= c) {
            System.out.println("a is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(" b is the largest number");
        }
        else {
            System.out.println("c is the largest number");
        }
    }
}
