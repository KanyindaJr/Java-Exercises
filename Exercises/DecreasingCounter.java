public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }
    public void printValue(){
        System.out.println("value is: " + value);
    }
    public void decreasing(){
       if (this.value > 0) {
        this.value -=1;
       }
        
    }
    public void reset(){
        this.value = 0;
    }
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);
            counter.printValue();

               counter.reset();
               counter.printValue();

               counter.decreasing();
               counter.printValue();
    }
}
