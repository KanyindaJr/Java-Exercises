public class SwapNumbers {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        System.out.println("Before Swap "+ "a = "+ a + " and b =" + b);
        a = a+b;
        b = a-b;
        a = a - b;
        System.out.println("After Swap " + "a = "+ a + " and b = "+ b);
    }
}
