package S1N2Ex4;

public class Jerbu extends Rodent{
    //Constructor
    public Jerbu(String kindRodent) {
        super("Jerbu");
    }

    public void sniff(){
        super.sniff();
        System.out.println("a lane of food.");
    }

    public void gnaw(){
        super.gnaw();
        System.out.println("the cables.");
    }

    public void run(){
        super.run();
        System.out.println("like a bitch.");
    }
}
