package S1N1Ex7;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        Frog rana = new Frog();
        rana.eat();
        rana.move();
        rana.breath();
        rana.croac();
        Amphibian froggy = (Amphibian) rana;
        //froggy.jump();
        System.out.println("We must create a method jump on Amphibian if we want froggy to jump");

        
    }
}
