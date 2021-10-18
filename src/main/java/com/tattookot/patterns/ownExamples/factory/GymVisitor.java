package main.java.com.tattookot.patterns.ownExamples.factory;

public class GymVisitor implements Visitor{
    @Override
    public void train() {
        System.out.println("The visitor trains in the gym");
    }
}
