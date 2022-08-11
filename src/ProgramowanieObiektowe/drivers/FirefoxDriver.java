package ProgramowanieObiektowe.drivers;

public class FirefoxDriver implements Webdriver{

    @Override
    public void get() {
        System.out.println("Otwieramy Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Firefox");
    }

}
