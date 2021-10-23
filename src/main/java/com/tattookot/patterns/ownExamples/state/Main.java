package main.java.com.tattookot.patterns.ownExamples.state;

public class Main {
    public static void main(String[] args) {
        Training training = new LegDay();
        Athlete powerlifter = new Athlete();

        powerlifter.setTraining(training);

        for(int i = 0; i<21; i++){
            powerlifter.train();
            powerlifter.planNextTraining();
        }
    }
}
