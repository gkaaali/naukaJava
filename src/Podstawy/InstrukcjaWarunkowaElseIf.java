package Podstawy;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number1 = 11;

        if (number1==0){
            System.out.println("Liczba równa 0");
        } else if (number1 > 0){
            System.out.println("Liczba dodatnia");
        }else if (number1 > 10){ //nie dojdzie do tego przypadku - liczby większe od 10 zostaną oznaczone jako "liczba dodatnia" bo ten if zostanie złapany wcześniej
            System.out.println("Liczba większa od 10");
        } else if (number1 < -5){
            System.out.println("Liczba mniejsza od - 5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
