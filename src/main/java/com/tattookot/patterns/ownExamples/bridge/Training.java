package main.java.com.tattookot.patterns.ownExamples.bridge;

public abstract class Training {
    protected Trainer trainer;

    public Training(Trainer trainer) {
        this.trainer = trainer;
    }

    abstract void trainVisitorInGym();
}
