package S1N2Ex1;

public class Unicycle extends Cycle {
    public Unicycle(){
        super(1);
    }
    public void ride(){
        super.ride();
        System.out.println(" and u are running on a unicycle.\n");
    }
    public void balance(){
        super.balance();
        System.out.println("The balance of the unicycle is ready to ride.\n");
    }

}
