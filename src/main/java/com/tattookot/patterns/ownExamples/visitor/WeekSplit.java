package main.java.com.tattookot.patterns.ownExamples.visitor;

public class WeekSplit {
    Training[] trainings;

    public WeekSplit() {
        trainings = new Training[]{
                new BackDay(),
                new BenchDay(),
                new LegDay()
        };
    }

    public void doSplit(Sportsman sportsman){
        for(Training training : trainings){
            training.doExercise(sportsman);
        }
    }
}
