package ProgramowanieObiektowe;

public class PracaDomowa6 {

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

    public PracaDomowa6 (String marka, String model, int rok, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }

//    public PracaDomowa6(){
//
//    }
}
