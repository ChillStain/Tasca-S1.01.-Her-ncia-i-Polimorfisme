package S1N2Ex4;

public class Rodent {
    private String kindRodent;

    public Rodent(String kindRodent){
        this.kindRodent = kindRodent;
    }

    public void sniff(){System.out.println(kindRodent + " sniff sniff");}


    public void gnaw() {System.out.println(kindRodent + " brrrrrrrrr");}


    public void run() {System.out.println(kindRodent + " booop booop");}

    public String getKindRodent(){
        return kindRodent;
    }

}
