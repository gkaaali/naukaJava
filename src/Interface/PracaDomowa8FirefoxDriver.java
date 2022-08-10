package Interface;

public class PracaDomowa8FirefoxDriver implements PracaDomowa8WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Firefox");
    }
}
