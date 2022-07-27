package ProgramowanieObiektowe;

public class UserKonstruktoryTest {

    public static void main(String[] args) {

//        UserKonstruktory user = new UserKonstruktory();
//
//        user.username = "Grzesiek";
//        user.password = "1234qwer";
//        user.sayHello();

        UserKonstruktory user2 = new UserKonstruktory("Grzesiek", "1234qwer");

        user2.sayHello();
    }
}
