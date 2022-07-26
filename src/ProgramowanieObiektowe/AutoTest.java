package ProgramowanieObiektowe;

public class AutoTest {

    public static void main(String[] args) {

        AutaKlasa mercedes = new AutaKlasa();
        mercedes.marka = "Mercedes";
        mercedes.model = "klasa S";
        mercedes.przebieg = 1119;
        mercedes.rok = 2022;

        mercedes.drive();
        mercedes.hold();
        mercedes.info();

        AutaKlasa audi = new AutaKlasa();
        mercedes.marka = "Audi";
        mercedes.model = "A5";
        mercedes.przebieg = 9119;
        mercedes.rok = 2021;

        audi.drive();
        audi.hold();
        audi.info();
    }
}
