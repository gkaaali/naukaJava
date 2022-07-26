package ProgramowanieObiektowe;

public class AutaKlasa {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void drive(){
        System.out.println("I'm drivieng");
    }

    public void hold(){
        System.out.println("I'm holding");
    }

    public void info(){
        System.out.println(marka);
        System.out.println(model);
        System.out.println(rok);
        System.out.println(przebieg);
    }
}
