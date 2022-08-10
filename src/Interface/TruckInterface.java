package Interface;

public class TruckInterface implements Vehicles{
    @Override
    public void drive(int speed) {
        System.out.println("Jadę ciężarówką z prędkością" + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką");
    }

    @Override
    public String info() {
        return "rower";
    }

    public void zatankuj(){
        System.out.println("Aby mieć dużo siły musze zjeść obiad");
    }
}
