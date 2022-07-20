package Podstawy;

public class Switch {

    public static void main(String[] args) {

        String danie = "inne";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 23 złote");
                break; //gdyby tego nie było to wydrukowałoby wynik dla pizzy i łososia
            case "łosoś":
                System.out.println("Cena to 30 zł");
                break;
            case "frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
