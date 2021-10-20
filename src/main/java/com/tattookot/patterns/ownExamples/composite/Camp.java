package main.java.com.tattookot.patterns.ownExamples.composite;

public class Camp {
    public static void main(String[] args) {
        Team team = new Team();

        Coach boxingCoach = new BoxingCoach();
        Coach grapplingCoach = new GrapplingCoach();
        Coach wrestlingCoach = new WrestlingCoach();

        team.addCoach(boxingCoach);
        team.addCoach(grapplingCoach);
        team.addCoach(wrestlingCoach);

        team.createCamp();
    }
}
