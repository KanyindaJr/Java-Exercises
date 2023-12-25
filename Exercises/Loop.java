public class Loop {
    public static void main(String[] args) {
            int x = 32;
    Boolean isPrime = true;
    int i = 2;
    while (i <= x /2){
        if (x % i == 0) {
            isPrime = false;
            break;
        }
        i++;
    }
    if(isPrime){
        System.out.println(x +" is a prime number");
    }
    else{
        System.out.println(x + " is not a prime number");
    }
}
}
