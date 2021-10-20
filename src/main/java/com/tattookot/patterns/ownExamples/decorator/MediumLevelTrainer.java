package main.java.com.tattookot.patterns.ownExamples.decorator;

public class MediumLevelTrainer extends TrainerDecorator {
    public MediumLevelTrainer(Trainer trainer) {
        super(trainer);
    }

    public String trainOwnClients(){
        return " Trains own clients.";
    }

    @Override
    public String train() {
        return super.train() + trainOwnClients();
    }
}
