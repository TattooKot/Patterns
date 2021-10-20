package main.java.com.tattookot.patterns.ownExamples.facade;

public class Coach {

    public void train(Gym gym){
        if(gym.isOpen()){
            System.out.println("Trainer trains visitors");
        } else {
            System.out.println("Trainer watches youtube");
        }
    }
}
