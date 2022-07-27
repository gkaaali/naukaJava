package ProgramowanieObiektowe;

public class StudentsKlasaTest {

    public static void main(String[] args) {

        // z klasy StudentsKlasa - pola statycznego
        String uczelnia = StudendtsKlasaIMetodyStatyczne.nazwaUczelni;

        StudendtsKlasaIMetodyStatyczne student1 = new StudendtsKlasaIMetodyStatyczne();
        StudendtsKlasaIMetodyStatyczne student2 = new StudendtsKlasaIMetodyStatyczne();
        StudendtsKlasaIMetodyStatyczne student3 = new StudendtsKlasaIMetodyStatyczne();

        student1.firstName = "Grzegorz";
        student1.lastName = "Kalinowski";
        student1.nick = "Grzesio";
        student1.indexNumber = 123;
        student1.email = "gk@wp.pl";
        //z pola statycznego
        String uczelniaStudent1 = student1.nazwaUczelni;

        student2.firstName = "Agata";
        student2.lastName = "Kalinowska";
        student2.nick = "Vobo";
        student2.indexNumber = 234;
        student2.email = "ak@wp.pl";

        student3.firstName = "Jan";
        student3.lastName = "Kalinowski";
        student3.nick = "Bunio";
        student3.indexNumber = 345;
        student3.email = "jk@wp.pl";

        StudendtsKlasaIMetodyStatyczne[] students = new StudendtsKlasaIMetodyStatyczne[] {student1,student2,student3};

        for(int i = 0; i < students.length;i++){
            students[i].introduceYourself();
            students[i].provideEmail();
            students[i].showIndexNumber();
            students[i].provideUczelnia();
        }
    }
}
