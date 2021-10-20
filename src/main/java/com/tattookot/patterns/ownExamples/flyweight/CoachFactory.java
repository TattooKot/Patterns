package main.java.com.tattookot.patterns.ownExamples.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoachFactory {
    private static final Map<String, Coach> coaches = new HashMap<>();

    public Coach getCoachBySpeciality(String speciality){
        Coach coach = coaches.get(speciality);

        if(coach == null){
            switch (speciality) {
                case ("gym") -> {
                    System.out.println("Hiring gym coach...");
                    coach = new GymCoach();
                }
                case ("mma") -> {
                    System.out.println("Hiring mma coach...");
                    coach = new MmaCoach();
                }
            }
            coaches.put(speciality, coach);
        }
        return coach;
    }
}
