package main.java.com.tattookot.patterns.ownExamples.abstractFactory.gym;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Administrator;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Manager;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.SmallBusinessTeamFactory;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Worker;

public class GymTeamFactory implements SmallBusinessTeamFactory {
    @Override
    public Administrator getAdministrator() {
        return new GymAdmin();
    }

    @Override
    public Worker getWorker() {
        return new Trainer();
    }

    @Override
    public Manager getManager() {
        return new GymManager();
    }
}
