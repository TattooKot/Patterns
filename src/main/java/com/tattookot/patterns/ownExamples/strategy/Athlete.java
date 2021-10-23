package main.java.com.tattookot.patterns.ownExamples.strategy;

public class Athlete {
    private Training training;

    public void setTraining(Training training) {
        this.training = training;
    }

    public void train(){
        training.train();
    }
}
