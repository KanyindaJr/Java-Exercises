class Engine{
    String make;
    String model;
    int year;
    public Engine(String make, String model, int year){
        this.make = make;
        this.model=model;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("Make:"+make);
        System.out.println("Model:"+ model);
        System.out.println("Year:"+ year);
    }
}
public class Main{
    public static void main(String[]args) {
        Engine myEngine = new Engine("Daihatsu","Turbo",2009);
        myEngine.displayInfo();
    }
}