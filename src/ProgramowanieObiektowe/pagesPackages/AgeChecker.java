package ProgramowanieObiektowe.packages.app.pagesPackages;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pooaj swój wiek");
        int wiek = scanner.nextInt();

        if (wiek > 100 || wiek < 1){
            System.out.println("Wiek nieprawidłowy");
        }  else if (wiek == 18){
            System.out.println("Wszystkiego najlepszego");
        } else if (wiek > 18){
            System.out.println("Na zdrowie");
        } else {
            System.out.println("Jesteś za młody");
        }
    }
}
