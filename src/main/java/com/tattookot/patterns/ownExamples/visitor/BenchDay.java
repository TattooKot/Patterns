package main.java.com.tattookot.patterns.ownExamples.visitor;

public class BenchDay implements Training{
    @Override
    public void doExercise(Sportsman sportsman) {
        sportsman.benchDay();
    }
}
