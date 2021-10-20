package main.java.com.tattookot.patterns.ownExamples.flyweight;

public class GymCoach implements Coach {
    @Override
    public void train() {
        System.out.println("Gym coach trains visitors...");
    }
}
