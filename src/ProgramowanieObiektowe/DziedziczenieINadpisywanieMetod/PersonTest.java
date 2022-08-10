package ProgramowanieObiektowe.DziedziczenieINadpisywanieMetod;

public class PersonTest extends Person{

    public PersonTest(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {

        //Mam dostęp do pól i metod klasy Person i klasy dziedziczącej MathTeacher
    MathTeacher teacherOne = new MathTeacher("Grzesiek", 35, "KUL");
        // z klasy nadrzędnej Person
        teacherOne.eat();
        teacherOne.walk();
        // metody z klasy Podrzędnej MathTeacher
        teacherOne.sayHello();
        teacherOne.myAge();
        teacherOne.teachMath();

        //Mam dostęp do pól i metod klasy Person i klasy dziedziczącej FootbalPlayer
    FootballPlayer playerOne = new FootballPlayer("Jasio", 6, "Lublinianka");
        playerOne.eat();
        playerOne.walk();
        playerOne.sayHello();
        playerOne.myAge();
        playerOne.playFootbal();

        //Mam dostęp do pól i metod klasy Person ale nie do pól i metod klas dziedziczących
        Person personOne = new Person("Agata", 34);
//        personOne.club = "Lublinianka";
        personOne.eat();
        personOne.walk();
//        personOne.sayHello();
//        personOne.myAge();
//        personOne.playFootbal();

        // nadpisywanie metod footballPlayer
        System.out.println("NADPISYWANIE METOD");
        playerOne.eat();

        // napisywanie metod mathTeacher
        teacherOne.eat();
        teacherOne.walk();
    }
}
