package main.java.com.tattookot.patterns.ownExamples.builder;

public class BenchBuilder extends GymMachineBuilder{
    @Override
    void buildName() {
        gymMachine.setName("Golden bench");
    }

    @Override
    void buildType() {
        gymMachine.setType(Type.BENCH);
    }

    @Override
    void buildPrice() {
        gymMachine.setPrice(300);
    }
}
