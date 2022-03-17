package S1N1Ex5;



public class Animal {
    int step  = 1;
    int step2 = 2;
    double stepD = 1.5;
    double stepD2 = 2.5;

    static int run(int i){
        System.out.println("I run \n");
        return i;
    }
    static int runSlow(int step){
        System.out.println("I run "+step+" step every second");
        return step;
    }
    int runHalfGas(int step, int step2){
        System.out.println("I run "+step2+step+" steps every" + step+ " second.");
        return step+step2;
    }
    double runFast(double step, double step2){
        System.out.println("I run"+stepD+stepD2+" steps every"+ step+ "second.");
        return stepD+stepD2;

    }




    public static void main(String[] args) {
        new Cat();

        System.out.println(Cat.runSlow(1));


    }
}
