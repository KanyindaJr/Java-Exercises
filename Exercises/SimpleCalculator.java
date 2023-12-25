public class SimpleCalculator{
    public static void main(String[]args){
        int resultAddition= Add(3,4);
        int resultSubtraction= Subtract(9,4);

        System.out.println("Addition Result:"+ resultAddition);
        System.out.println("Subtraction Result:" + resultSubtraction);
    }
    public static int Add(int a, int b) {
        return (a + b);
    }
    public static int Subtract(int a, int b) {
        return (a - b);
    }
}