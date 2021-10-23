package main.java.com.tattookot.patterns.ownExamples.strategy;

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();

        athlete.setTraining(new LegDay());
        athlete.train();

        athlete.setTraining(new BenchDay());
        athlete.train();

        athlete.setTraining(new BackDay());
        athlete.train();
    }
}
