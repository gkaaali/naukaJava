package ProgramowanieObiektowe.modyfikatoryDostępu.second;

import ProgramowanieObiektowe.modyfikatoryDostępu.first.Parent;

public class Random {

    // Klasa w innej paczce nie ma dostępu do pól i metod private, default oraz protected

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.second);
//        System.out.println(parent.third);
//        System.out.println(parent.fouth);
        parent.firstMethod();
//        parent.secondMethod();
//        parent.thirdMethod();
//        parent.fourthMethod();
    }
}
