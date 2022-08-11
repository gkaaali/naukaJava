package ProgramowanieObiektowe;

import Interface.PracaDomowa8FirefoxDriver;
import Interface.PracaDomowa8WebDriver;
import ProgramowanieObiektowe.drivers.FirefoxDriver;
import ProgramowanieObiektowe.drivers.Webdriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // a zostaje przekonwertowana na double

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        // Konwersja/rzutowanie obiektów
        PracaDomowa8WebDriver driver = new PracaDomowa8FirefoxDriver();
        PracaDomowa8FirefoxDriver firefoxDriver = (PracaDomowa8FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
