package ProgramowanieObiektowe;

import ProgramowanieObiektowe.DziedziczenieINadpisywanieMetod.Person;

public class FinalTest {

    public static void main(String[] args) {

        final int x = 2;

        final Person person = new Person("Kuba", 23);
        person.age = 24;
    }
}
