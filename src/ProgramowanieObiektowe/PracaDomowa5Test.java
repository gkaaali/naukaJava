package ProgramowanieObiektowe;

import java.util.Scanner;

public class PracaDomowa5Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        Integer firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        Integer secondNumber = scanner.nextInt();

        PracaDomowa5 calculator = new PracaDomowa5();

        int additionResult = calculator.addition(firstNumber, secondNumber);
        int substractionResult = calculator.substraction(firstNumber, secondNumber);
        int multiplicationResult = calculator.multiplication(firstNumber, secondNumber);
        int divisionResult = calculator.division(firstNumber, secondNumber);
        int modResult = calculator.mod(firstNumber, secondNumber);

        System.out.println(additionResult);
        System.out.println(substractionResult);
        System.out.println(multiplicationResult);
        System.out.println(divisionResult);
        System.out.println(modResult);
    }
}
