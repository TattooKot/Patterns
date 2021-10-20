package main.java.com.tattookot.patterns.ownExamples.facade;

public class Workflow {
    Day day = new Day();
    Gym gym = new Gym();
    Coach coach = new Coach();

    public void openGym(){
        day.newDay();
        gym.openGym();
        coach.train(gym);
    }
}
