package ProgramowanieObiektowe.modyfikatoryDostępu.first;

public class Child extends Parent{


    // Klasa potomna w tej samej paczce nie ma dostępu do pól i metod private

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fouth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
