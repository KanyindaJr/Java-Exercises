public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int factorial = 1;
        for (int i = 1; i<= n ; i++){
            factorial *= i;
        }
        System.out.println("The Factorial of "+ n +" is " + factorial);
    }
}
