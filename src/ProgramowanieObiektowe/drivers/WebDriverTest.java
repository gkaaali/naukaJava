package ProgramowanieObiektowe.drivers;

public class WebDriverTest {

    public static void main(String[] args) {

        Webdriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
    }

    private static Webdriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        } return null;
    }
}
