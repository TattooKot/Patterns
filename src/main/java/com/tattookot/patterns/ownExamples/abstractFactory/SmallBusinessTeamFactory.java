package main.java.com.tattookot.patterns.ownExamples.abstractFactory;

public interface SmallBusinessTeamFactory {
    Administrator getAdministrator();
    Worker getWorker();
    Manager getManager();
}
