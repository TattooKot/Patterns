package main.java.com.tattookot.patterns.ownExamples.state;

public class Athlete {
    private Training training;

    public void setTraining(Training training) {
        this.training = training;
    }

    public void planNextTraining(){
        if(training instanceof LegDay){
            setTraining(new BenchDay());
        } else if(training instanceof BenchDay){
            setTraining(new BackDay());
        } else if(training instanceof BackDay){
            setTraining(new LegDay());
        }
    }

    public void train(){
        training.train();
    }
}
