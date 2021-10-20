package main.java.com.tattookot.patterns.ownExamples.bridge;

public class WeightLossTraining extends Training{

    public WeightLossTraining(Trainer trainer) {
        super(trainer);
    }

    @Override
    void trainVisitorInGym() {
        System.out.println("Training for weight loss starts...");
        trainer.train();
    }
}
