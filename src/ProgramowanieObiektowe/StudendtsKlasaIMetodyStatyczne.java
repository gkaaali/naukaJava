package ProgramowanieObiektowe;

public class StudendtsKlasaIMetodyStatyczne {

    public String firstName;
    public String lastName;
    public String nick;
    public String email;
    public int indexNumber;
    // pole statyczne - charakterystyczne dla całej klasy, nie dla obiektu klasy. Nie moge tego zmienic w obiekcie.
    // Na przykład "nazwaUczelni" - ma być taka sama dla obiektu klasy StudentsKlasa
    public static String nazwaUczelni = "KUL";


    public void introduceYourself(){
        System.out.println("my name is: " + firstName + lastName);
    }

    public void logIn(){
        System.out.println("I log in as: " + nick);
    }

    public void showIndexNumber(){
        System.out.println("my index number is: " + indexNumber);
    }

    public void provideEmail(){
        System.out.println("my email is: " + email);
    }

    public void provideUczelnia(){System.out.println("My uczlenia is: " + nazwaUczelni);}
}
