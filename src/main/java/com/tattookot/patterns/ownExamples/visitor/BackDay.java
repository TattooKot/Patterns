package main.java.com.tattookot.patterns.ownExamples.visitor;

public class BackDay implements Training{
    @Override
    public void doExercise(Sportsman sportsman) {
        sportsman.backDay();
    }
}
