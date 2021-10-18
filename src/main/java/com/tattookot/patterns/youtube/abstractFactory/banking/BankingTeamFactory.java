package main.java.com.tattookot.patterns.youtube.abstractFactory.banking;

import main.java.com.tattookot.patterns.youtube.abstractFactory.Developer;
import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectManager;
import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectTeamFactory;
import main.java.com.tattookot.patterns.youtube.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
