package S1N1Ex8;

public class Frog extends Amphibian {
    public Frog() {
    }

    @Override
    public void move() {
        System.out.println("I`m moving slowly like a snail.");
    }

    @Override
    public void breath() {
        System.out.println("I`m dying without breath.");
    }

    @Override
    public void eat() {
        System.out.println("I can`t eat anymore.");
    }

    public void croac() {
        System.out.println("Croackkkkkk¡¡¡¡¡");
    }

    public void jump() {
        System.out.println("Woooooooooohhh¡¡¡¡¡");
    }
}