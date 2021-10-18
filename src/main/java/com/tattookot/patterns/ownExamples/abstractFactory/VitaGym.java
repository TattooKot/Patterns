package main.java.com.tattookot.patterns.ownExamples.abstractFactory;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.gym.GymTeamFactory;

public class VitaGym {
    public static void main(String[] args) {
        SmallBusinessTeamFactory factory = new GymTeamFactory();
        Worker trainer = factory.getWorker();
        Administrator gymAdmin = factory.getAdministrator();
        Manager gymManager = factory.getManager();

        System.out.println("Gym starts work...");
        gymAdmin.administrate();
        trainer.work();
        gymManager.manage();
    }
}
