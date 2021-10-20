package main.java.com.tattookot.patterns.ownExamples.bridge;

public class PowerliftingTrainer implements Trainer{
    @Override
    public void train() {
        System.out.println("Powerlifting trainer trains visitor...");
    }
}
