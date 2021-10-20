package main.java.com.tattookot.patterns.ownExamples.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Coach> coachList = new ArrayList<>();

    public void addCoach(Coach coach){
        coachList.add(coach);
    }

    public void removeCoach(Coach coach){
        coachList.remove(coach);
    }

    public void createCamp(){
        System.out.println("New training camp starts...\n");

        for(Coach coach : coachList){
            coach.coaching();
        }
    }
}
