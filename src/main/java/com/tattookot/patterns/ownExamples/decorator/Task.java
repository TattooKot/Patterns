package main.java.com.tattookot.patterns.ownExamples.decorator;

public class Task {
    public static void main(String[] args) {
        Trainer trainer = new HeadTrainer(new MediumLevelTrainer(new BeginnerTrainer()));

        System.out.println(trainer.train());
    }
}
