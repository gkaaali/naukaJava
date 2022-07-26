package ProgramowanieObiektowe;

import java.util.Scanner;

public class MetodyTest {

    public static void main(String[] args) {

        Metody metody = new Metody();
        metody.policzWynik();

        // z metody pobierającej wartość
//        int result = metody.pobierzWynik();
//        System.out.println(result);

        //metody z parametrami
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);
        metody.add(5,3);
    }

}
