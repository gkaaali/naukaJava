package ProgramowanieObiektowe.modyfikatoryDostępu.first;

public class Random {

    // Klasa w tej samej paczce nie ma dostępu do pól i metod private

 public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
//        System.out.println(parent.fouth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
//        parent.fourthMethod();
    }
}
