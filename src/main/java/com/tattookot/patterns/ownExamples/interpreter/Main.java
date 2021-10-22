package main.java.com.tattookot.patterns.ownExamples.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression number = new NumberExpression();
        Expression phone = new PhoneExpression();

        System.out.println(number.interpret("123432"));
        System.out.println(number.interpret("fdfsd"));
        System.out.println(phone.interpret("dasdad"));
        System.out.println(phone.interpret("0506928026"));
    }
}
