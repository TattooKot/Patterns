package main.java.com.tattookot.patterns.ownExamples.abstractFactory.gym;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Administrator;

public class GymAdmin implements Administrator {
    @Override
    public void administrate() {
        System.out.println("Gym administrator makes training schedules...");
    }
}
