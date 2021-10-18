package main.java.com.tattookot.patterns.youtube.abstractFactory.website;

import main.java.com.tattookot.patterns.youtube.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
