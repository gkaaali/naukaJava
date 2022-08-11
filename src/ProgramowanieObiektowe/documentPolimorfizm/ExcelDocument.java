package ProgramowanieObiektowe.documentPolimorfizm;

public class ExcelDocument extends DocumentPolimorfizm{

    @Override
    public void getDescription() {
        System.out.println("I am excel document");
    }
}
