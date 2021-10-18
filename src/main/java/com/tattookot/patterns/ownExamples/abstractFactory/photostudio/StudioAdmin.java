package main.java.com.tattookot.patterns.ownExamples.abstractFactory.photostudio;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Administrator;

public class StudioAdmin implements Administrator {
    @Override
    public void administrate() {
        System.out.println("Admin makes photo session schedules...");
    }
}
