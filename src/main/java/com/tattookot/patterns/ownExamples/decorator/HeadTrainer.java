package main.java.com.tattookot.patterns.ownExamples.decorator;

public class HeadTrainer extends TrainerDecorator{
    public HeadTrainer(Trainer trainer) {
        super(trainer);
    }

    public String teachTrainers(){
        return " Teaches trainers.";
    }

    @Override
    public String train() {
        return super.train() + teachTrainers();
    }
}
