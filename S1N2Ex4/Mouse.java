package S1N2Ex4;

public class Mouse extends Rodent{
    public Mouse(String kindRodent) {
        super("Mouse");
    }
    public void sniff(){
        super.sniff();
        System.out.println("a lane of cheese.");
    }

    public void gnaw(){
        super.gnaw();
        System.out.println("the shoes.");
    }

    public void run(){
        super.run();
        System.out.println("like a beep beep.");
    }
}
