public class door {
    public door(){
        
    }
    public void knock(){
        System.out.println("who's there?");
    }
    public static void main(String[] args) {
        door alexander = new door();
        alexander.knock();
        alexander.knock();
    }
}
