public class Product {
    private double price;
    private int quantity;
    private String name;
 
    public Product(String initialName,  int initialQuantity, double initialPrice){
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }
    public void printProduct(){
        System.out.println(this.name +", "+ this.quantity+" pieces, Price"+ this.price);
    }
    public static void main(String[] args) {
        Product banana = new Product("Banana",13, 1.1 );

        banana.printProduct();
    }
}
