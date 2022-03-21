package S1N2Ex4;

public class Main{
    public static void main(String[] args) {
        Hamster hamster = new Hamster("Hamster");
        Jerbu jerbu = new Jerbu("Jerbu");
        Mouse mouse = new Mouse("Mouse");

        Rodent[] matrix = new Rodent[3];

        hamster.sniff();
        hamster.gnaw();
        hamster.run();
        jerbu.gnaw();
        jerbu.run();
        jerbu.sniff();
        mouse.sniff();
        mouse.gnaw();
        mouse.run();

        matrix [0 ] = hamster;
        matrix [1] = jerbu;
        matrix [2] = mouse;

    }
}
