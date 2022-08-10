package ProgramowanieObiektowe.modyfikatoryDostępu.second;

import ProgramowanieObiektowe.modyfikatoryDostępu.first.Parent;

public class Child extends Parent {


    // Klasa potomna w innej paczce nie ma dostępu do pól i metod private oraz default - domyślnych

    public void testIdentifier() {
        System.out.println(first);
//        System.out.println(second);
        System.out.println(third);
//        System.out.println(fouth);
        firstMethod();
//        secondMethod();
        thirdMethod();
//        fourthMethod();
    }
}
