public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String initialFirstName, String initialSecondName){
        this.firstName = initialFirstName;
        this.lastName = initialSecondName;
    }
    public String toString(){
        return "Name is " + this.lastName +", " + this.firstName + " " +this.lastName + ".";
    }
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");

        System.out.println(bond);
    }
}
