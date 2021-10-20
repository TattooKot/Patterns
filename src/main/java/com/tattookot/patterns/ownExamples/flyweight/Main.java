package main.java.com.tattookot.patterns.ownExamples.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoachFactory coachFactory = new CoachFactory();
        List<Coach> coaches = new ArrayList<>();

        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("gym"));
        coaches.add(coachFactory.getCoachBySpeciality("mma"));

        for(Coach coach : coaches){
            coach.train();
        }
    }
}
