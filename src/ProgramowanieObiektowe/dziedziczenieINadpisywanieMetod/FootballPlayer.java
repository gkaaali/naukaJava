package ProgramowanieObiektowe.dziedziczenieINadpisywanieMetod;

public class FootballPlayer extends Person {

    public FootballPlayer(String name, int age, String club){
        super(name, age);
        this.club = club;
    }

    public String club;

    public void playFootbal() {
        eat();
        walk();
        System.out.println("I'm playing football");
    }

    public void sayHello() {
        System.out.println("My name is: " + name);
    }

    public void myAge() {
        System.out.println("My age is: " + age);
    }

    // nadpisywanie metod - z klasy Person
    public void eat(){
        System.out.println("I like healthy food");
    }
}
