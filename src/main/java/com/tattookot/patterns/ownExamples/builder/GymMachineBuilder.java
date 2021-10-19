package main.java.com.tattookot.patterns.ownExamples.builder;

public abstract class GymMachineBuilder {
    GymMachine gymMachine;

    void createGymMachine(){
        gymMachine = new GymMachine();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildPrice();

    GymMachine getGymMachine(){
        return gymMachine;
    }
}
