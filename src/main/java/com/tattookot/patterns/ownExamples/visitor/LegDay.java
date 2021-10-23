package main.java.com.tattookot.patterns.ownExamples.visitor;

public class LegDay implements Training{
    @Override
    public void doExercise(Sportsman sportsman) {
        sportsman.legDay();
    }
}
