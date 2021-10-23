package main.java.com.tattookot.patterns.ownExamples.observer;

public class CarDealer implements Observer{
    private String name;

    public CarDealer(String name) {
        this.name = name;
    }

    @Override
    public void newCar(String info) {
        System.out.println("Dear " + name + ", we have new car:\n" + info +
                "\n=====================\n");
    }
}
