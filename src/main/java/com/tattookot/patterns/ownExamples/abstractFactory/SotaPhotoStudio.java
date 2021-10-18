package main.java.com.tattookot.patterns.ownExamples.abstractFactory;

import main.java.com.tattookot.patterns.ownExamples.abstractFactory.photostudio.PhotoStudioTeamFactory;

public class SotaPhotoStudio {
    public static void main(String[] args) {
        SmallBusinessTeamFactory factory = new PhotoStudioTeamFactory();
        Administrator studioAdmin = factory.getAdministrator();
        Worker photographer = factory.getWorker();
        Manager studioManager = factory.getManager();

        System.out.println("Studio starts work..");
        studioAdmin.administrate();
        photographer.work();
        studioManager.manage();
    }
}
