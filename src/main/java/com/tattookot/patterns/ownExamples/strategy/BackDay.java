package main.java.com.tattookot.patterns.ownExamples.strategy;

public class BackDay implements Training {
    @Override
    public void train() {
        System.out.println("Back training today...");
    }
}
