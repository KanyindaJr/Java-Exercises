public class exitingloop {
    public static void main(String[] args) {
        int number = 0;
        while (true) {
            
            if (number >= 5) {
                number = number + 1;
            }
            if (number < 5) {
                continue;
            }
            
        }
       
    }
}
