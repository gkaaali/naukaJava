package Interface;

public class BikeInterface implements Vehicles{
    @Override
    public void drive(int speed) {
        System.out.println("Jade rowerem z prędkością" + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem, naciskam mocno na pedały");
    }

    @Override
    public String info() {
        return "bike";
    }


}
