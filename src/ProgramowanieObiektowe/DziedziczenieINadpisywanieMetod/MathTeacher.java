package ProgramowanieObiektowe.Dziedziczenie;

public class MathTeacher extends Person {

    public MathTeacher(String name, int age, String school){
        super(name, age);
        this.school = school;
    }

    public String school;

    public void teachMath() {
        System.out.println("I'm teaching math");
    }

    public void sayHello() {
        System.out.println("My name is: " + name);
    }

    public void myAge() {
        System.out.println("My age is: " + age);
    }

    public void walk (){
        System.out.println("I walk very fast");
    }
}
