package ProgramowanieObiektowe;

public class StudendtsKlasa {

    public String firstName;
    public String lastName;
    public String nick;
    public String email;
    public int indexNumber;

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
}
