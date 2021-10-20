package main.java.com.tattookot.patterns.ownExamples.facade;

public class Gym {
    boolean open;

    public boolean isOpen() {
        return open;
    }

    public void openGym(){
        System.out.println("Gym opened now. Let`s train!");
        open = true;
    }

    public void closeGym(){
        System.out.println("Gym closed now. See you tomorrow!");
    }
}
