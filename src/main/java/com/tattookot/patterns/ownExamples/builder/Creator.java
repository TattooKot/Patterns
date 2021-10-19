package main.java.com.tattookot.patterns.ownExamples.builder;

public class Creator {
    GymMachineBuilder gymMachineBuilder;

    public void setGymMachineBuilder(GymMachineBuilder gymMachineBuilder) {
        this.gymMachineBuilder = gymMachineBuilder;
    }

    GymMachine buildGymMachine(){
        gymMachineBuilder.createGymMachine();
        gymMachineBuilder.buildName();
        gymMachineBuilder.buildType();
        gymMachineBuilder.buildPrice();

        GymMachine machine = gymMachineBuilder.getGymMachine();

        return machine;
    }
}
