package main.java.com.tattookot.patterns.youtube.abstractFactory.banking;

import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
