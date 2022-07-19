package Podstawy;

public class OperatoryMatematyczne {

    public static void main(String[] args) {

    int firstNumber = 4;
    int secondNumber = 6;

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

        firstNumber+=secondNumber;
        System.out.println(firstNumber);
        firstNumber-=secondNumber;
        System.out.println(firstNumber);
        firstNumber*=secondNumber;
        System.out.println(firstNumber);
        firstNumber/=secondNumber;
        System.out.println(firstNumber);
        firstNumber%=secondNumber;
        System.out.println(firstNumber);
    }
}