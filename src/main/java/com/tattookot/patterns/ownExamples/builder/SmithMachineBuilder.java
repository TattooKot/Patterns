package main.java.com.tattookot.patterns.ownExamples.builder;

public class SmithMachineBuilder extends GymMachineBuilder{
    @Override
    void buildName() {
        gymMachine.setName("Smith machine from ankle Smith");
    }

    @Override
    void buildType() {
        gymMachine.setType(Type.SMITHMACHINE);
    }

    @Override
    void buildPrice() {
        gymMachine.setPrice(2500);
    }
}
