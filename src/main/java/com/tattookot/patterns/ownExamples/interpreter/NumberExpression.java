package main.java.com.tattookot.patterns.ownExamples.interpreter;

public class NumberExpression implements Expression{

    @Override
    public boolean interpret(String context) {
        return context.matches("\\d*");
    }
}
