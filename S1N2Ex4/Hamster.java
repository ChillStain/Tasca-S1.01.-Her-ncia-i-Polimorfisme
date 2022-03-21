package S1N2Ex4;

public class Hamster extends Rodent{
    public Hamster(String kindRodent) {
        super("Hamster");
    }
    public void sniff(){
        super.sniff();
        System.out.println("the whole day.");
    }

    public void gnaw(){
        super.gnaw();
        System.out.println("his house.");
    }

    public void run(){
        super.run();
        System.out.println("on the wheel.");
    }
}
