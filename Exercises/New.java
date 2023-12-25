class Car{
    String make;
    String model;
    int year;
    public  Car(String make, String model, int year) {
        this.make= make;
        this.model= model;
        this.year= year;
    }
    public void displayInfo() {
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
}
public class New{
    public static void main(String[]args) {
        Car myCar= new Car ("Forester","Subaru", 2022);
        myCar.displayInfo();
    }
}