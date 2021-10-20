package main.java.com.tattookot.patterns.ownExamples.bridge;

public class MassTraining extends Training{

    public MassTraining(Trainer trainer) {
        super(trainer);
    }

    @Override
    void trainVisitorInGym() {
        System.out.println("Training for muscle grow starts..");
        trainer.train();
    }
}
