package main.java.com.tattookot.patterns.youtube.facade;

public class Developer {

    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isSprintActive()){
            System.out.println("Developer solving problems..");
        } else{
            System.out.println("Developer reading habrahabr");
        }
    }
}
