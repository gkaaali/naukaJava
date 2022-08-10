package ProgramowanieObiektowe.modyfikatoryDostępu.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fouth = "private";

    public void firstMethod(){
        System.out.println("public");
    }

    void secondMethod(){
        System.out.println("default");
    }

    protected void thirdMethod(){
        System.out.println("protected");
    }

    private void fourthMethod(){
        System.out.println("private");
    }

    public void testIdentifires(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fouth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
