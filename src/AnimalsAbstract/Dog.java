package AnimalsAbstract;

public class Dog extends Animals{
    @Override
    public void sound() {
        System.out.println("Hau");
        sayHello();
        System.out.println("Numer of Legs" + Legs);
    }
}
