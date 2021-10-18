package main.java.com.tattookot.patterns.ownExamples.singleton;

public class UserPasswordControl {
    private static UserPasswordControl passwordControl;
    private static int count = 0;
    private static final String password = "password";

    public static synchronized UserPasswordControl getUserPasswordControl(){
        if(passwordControl == null){
            passwordControl = new UserPasswordControl();
        }
        return passwordControl;
    }

    void enterPassword(String password){
        if(count == 5){
            System.out.println("Too many attempts. Try again after 30 min.");
            return;
        }
        count++;
        if(password.equals(UserPasswordControl.password)){
            System.out.println("Welcome!");
            count = 0;
        } else {
            System.out.println("Bad password try again");
        }
    }

    private UserPasswordControl(){}
}
