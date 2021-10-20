package main.java.com.tattookot.patterns.ownExamples.decorator;

public class TrainerDecorator implements Trainer{
    Trainer trainer;

    public TrainerDecorator(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String train() {
        return trainer.train();
    }
}
