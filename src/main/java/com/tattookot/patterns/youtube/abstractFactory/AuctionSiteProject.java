package main.java.com.tattookot.patterns.youtube.abstractFactory;

import main.java.com.tattookot.patterns.youtube.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager manager = factory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
