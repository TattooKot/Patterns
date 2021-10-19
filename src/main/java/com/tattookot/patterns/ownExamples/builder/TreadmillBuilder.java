package main.java.com.tattookot.patterns.ownExamples.builder;

public class TreadmillBuilder extends GymMachineBuilder{
    @Override
    void buildName() {
        gymMachine.setName("Treadmill 9000");
    }

    @Override
    void buildType() {
        gymMachine.setType(Type.TREADMILL);
    }

    @Override
    void buildPrice() {
        gymMachine.setPrice(1000);
    }
}
