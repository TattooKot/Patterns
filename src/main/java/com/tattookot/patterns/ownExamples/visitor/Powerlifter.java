package main.java.com.tattookot.patterns.ownExamples.visitor;

public class Powerlifter implements Sportsman{
    @Override
    public void legDay() {
        System.out.println("Do hard leg training for 2 hours");
    }

    @Override
    public void backDay() {
        System.out.println("Do heavy deadlifts...");
    }

    @Override
    public void benchDay() {
        System.out.println("Bench all plates in gym...");
    }
}
