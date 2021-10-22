package main.java.com.tattookot.patterns.ownExamples.interpreter;

public class PhoneExpression implements Expression{
    @Override
    public boolean interpret(String context) {
        return context.matches("\\d{10}");
    }
}
