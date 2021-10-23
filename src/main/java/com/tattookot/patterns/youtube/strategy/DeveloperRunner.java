package main.java.com.tattookot.patterns.youtube.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();


        developer.setActivity(new Sleeping());
        developer.execute();

        developer.setActivity(new Training());
        developer.execute();

        developer.setActivity(new Coding());
        developer.execute();

        developer.setActivity(new Reading());
        developer.execute();

        developer.setActivity(new Sleeping());
        developer.execute();
    }
}
