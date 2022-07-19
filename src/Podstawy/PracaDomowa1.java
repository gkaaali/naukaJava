package Podstawy;

import java.util.Scanner;

public class PracaDomowa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        Integer firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        Integer secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);
    }
}
