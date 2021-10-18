package main.java.com.tattookot.patterns.youtube.abstractFactory.website;

import main.java.com.tattookot.patterns.youtube.abstractFactory.Developer;
import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectManager;
import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectTeamFactory;
import main.java.com.tattookot.patterns.youtube.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
