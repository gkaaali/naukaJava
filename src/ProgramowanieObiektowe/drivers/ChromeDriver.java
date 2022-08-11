package ProgramowanieObiektowe.drivers;

public class ChromeDriver implements Webdriver {
    @Override
    public void get() {
        System.out.println("Otwieramy Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Chrome");
    }
}
