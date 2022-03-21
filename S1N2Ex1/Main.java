package S1N2Ex1;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();
        bicycle.ride();
        unicycle.ride();
        tricycle.ride();

        Cycle[] type = new Cycle[]{bicycle,unicycle};;

        for(int i = 0; i < type.length; i++){
            if (type[i] instanceof Unicycle){
                type[i].balance();
            }else if(type[i] instanceof Bicycle){
                type[i].balance();
            }
        }


    }
}
