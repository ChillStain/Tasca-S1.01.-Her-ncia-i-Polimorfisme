package S1N2Ex1;

public class Bicycle extends Cycle {

    public Bicycle (){
        super(2);
    }

    public void ride(){
        super.ride();
        System.out.println(" and u are running on a bicycle.\n");
    }
    public void balance(){
        super.balance();
        System.out.println("The balance of the bicycle is ready to ride.\n");
    }



}
