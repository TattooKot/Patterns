package main.java.com.tattookot.patterns.ownExamples.abstractFactory.gym;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Worker;

public class Trainer implements Worker {
    @Override
    public void work() {
        System.out.println("Trainer trains the visitor...");
    }
}
