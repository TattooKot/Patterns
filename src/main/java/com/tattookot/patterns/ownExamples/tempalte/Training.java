package main.java.com.tattookot.patterns.ownExamples.tempalte;

public abstract class Training {
    public void train(){
        System.out.println("Warm up");
        doTrainingPlan();
        System.out.println("Cool down");
    }

    public abstract void doTrainingPlan();
}
