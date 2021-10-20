package main.java.com.tattookot.patterns.youtube.facade;

public class BugTracker {
    private boolean sprintActive;

    public boolean isSprintActive() {
        return sprintActive;
    }

    public void startSprint(){
        System.out.println("Sprint is active.");
        sprintActive = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active.");
        sprintActive = false;
    }
}
