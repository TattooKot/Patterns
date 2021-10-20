package main.java.com.tattookot.patterns.ownExamples.bridge;

public class FitnessTrainer implements Trainer{
    @Override
    public void train() {
        System.out.println("Fitness trainer trains visitor...");
    }
}
