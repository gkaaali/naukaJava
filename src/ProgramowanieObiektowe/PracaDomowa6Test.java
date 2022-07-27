package ProgramowanieObiektowe;

public class PracaDomowa6Test {

    public static void main(String[] args) {

        PracaDomowa6 opel = new PracaDomowa6("Opel", "Astra", 2021, 19887);

        opel.drive();
        opel.hold();
        opel.info();

        PracaDomowa6 audi = new PracaDomowa6("Audi", "A5", 2021, 9119);

        audi.drive();
        audi.hold();
        audi.info();
    }
}
