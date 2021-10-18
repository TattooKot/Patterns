package main.java.com.tattookot.patterns.ownExamples.singleton;

public class Main {
    public static void main(String[] args) {
        UserPasswordControl.getUserPasswordControl().enterPassword("p");
        UserPasswordControl.getUserPasswordControl().enterPassword("pa");
//        UserPasswordControl.getUserPasswordControl().enterPassword("password");
        UserPasswordControl.getUserPasswordControl().enterPassword("passwor");
        UserPasswordControl.getUserPasswordControl().enterPassword("passwod");
        UserPasswordControl.getUserPasswordControl().enterPassword("passwrd");
        UserPasswordControl.getUserPasswordControl().enterPassword("passord");
        UserPasswordControl.getUserPasswordControl().enterPassword("pasword");
    }
}
