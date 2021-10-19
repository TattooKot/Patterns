package main.java.com.tattookot.patterns.ownExamples.builder;

public class CreateMachineRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.setGymMachineBuilder(new SmithMachineBuilder());

        GymMachine gymMachine = creator.buildGymMachine();

        System.out.println(gymMachine);
    }
}
