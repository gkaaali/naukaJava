package ProgramowanieObiektowe.documentPolimorfizm;

public class PdfDocument extends DocumentPolimorfizm{

    @Override
    public void getDescription() {
        System.out.println("I am PDF document");
    }
}
