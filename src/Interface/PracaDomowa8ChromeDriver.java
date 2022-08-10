package Interface;

public class PracaDomowa8ChromeDriver implements PracaDomowa8WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Chrome");
    }
}
