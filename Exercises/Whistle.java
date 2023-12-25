public class Whistle {
    private String sound;

    public Whistle(String whistlesound){
        this.sound = whistlesound;
    }
    public void sound(){
        System.out.println(this.sound);
    }
    public static void main(String[] args) {
        Whistle duck = new Whistle("Kwa kwa");
        Whistle horse = new Whistle("niigh");
        duck.sound();
        horse.sound();
    }
}
