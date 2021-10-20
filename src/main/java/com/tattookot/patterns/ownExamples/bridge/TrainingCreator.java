package main.java.com.tattookot.patterns.ownExamples.bridge;

public class TrainingCreator {
    public static void main(String[] args) {
        Training[] trainings = {
                new MassTraining(new FitnessTrainer()),
                new WeightLossTraining(new PowerliftingTrainer())
        };

        for(Training training : trainings){
            training.trainVisitorInGym();
        }
    }
}
