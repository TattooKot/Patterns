package main.java.com.tattookot.patterns.ownExamples.abstractFactory.photostudio;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Worker;

public class Photographer implements Worker {
    @Override
    public void work() {
        System.out.println("Photographer makes photos...");
    }
}
