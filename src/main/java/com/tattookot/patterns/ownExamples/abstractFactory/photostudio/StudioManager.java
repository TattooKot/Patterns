package main.java.com.tattookot.patterns.ownExamples.abstractFactory.photostudio;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Manager;

public class StudioManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Manager manages photo studio...");
    }
}
