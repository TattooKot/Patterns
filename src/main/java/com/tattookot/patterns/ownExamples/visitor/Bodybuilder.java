package main.java.com.tattookot.patterns.ownExamples.visitor;

public class Bodybuilder implements Sportsman{
    @Override
    public void legDay() {
        System.out.println("Do only one muscle group with 5 exercises...");
    }

    @Override
    public void backDay() {
        System.out.println("Do 5 exercises for lats...");
    }

    @Override
    public void benchDay() {
        System.out.println("Benching 50% from 1rm");
    }
}
