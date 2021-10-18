package main.java.com.tattookot.patterns.ownExamples.abstractFactory.gym;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Manager;

public class GymManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Gym manager manages gym...");
    }
}
