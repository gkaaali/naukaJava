package ProgramowanieObiektowe.documentPolimorfizm;

public class DocumentCheckerTest {
    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument();
        DocumentPolimorfizm excelDocument = new ExcelDocument();
        DocumentPolimorfizm pdfDocument = new DocumentPolimorfizm();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
