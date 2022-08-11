package ProgramowanieObiektowe.dziedziczenieINadpisywanieMetod;

public class PracaDomowa7Test {
    public static void main(String[] args) {

        PracaDomowa7Android androidApp = new PracaDomowa7Android("graAndroid");
        androidApp.appVersion();

        PracaDomowa7Iphone iphoneApp = new PracaDomowa7Iphone("graIphone");
        iphoneApp.appVersion();
    }

}
