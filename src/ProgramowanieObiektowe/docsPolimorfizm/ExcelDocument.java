package ProgramowanieObiektowe.docsPolimorfizm;

public class ExcelDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I'm excel document");
    }
}
