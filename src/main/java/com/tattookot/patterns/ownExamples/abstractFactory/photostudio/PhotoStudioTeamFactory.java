package main.java.com.tattookot.patterns.ownExamples.abstractFactory.photostudio;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Administrator;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Manager;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.SmallBusinessTeamFactory;
import main.java.com.tattookot.patterns.ownExamples.abstractFactory.Worker;

public class PhotoStudioTeamFactory implements SmallBusinessTeamFactory {
    @Override
    public Administrator getAdministrator() {
        return new StudioAdmin();
    }

    @Override
    public Worker getWorker() {
        return new Photographer();
    }

    @Override
    public Manager getManager() {
        return new StudioManager();
    }
}
