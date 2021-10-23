package main.java.com.tattookot.patterns.ownExamples.observer;

public class Main {
    public static void main(String[] args) {
        Manheim manheim = new Manheim();
        Observer dealer1 = new CarDealer("Vasia");
        Observer dealer2 = new CarDealer("Kolya");

        manheim.addDealer(dealer1);
        manheim.addDealer(dealer2);

        manheim.addCar("Nissan leaf");
        manheim.addCar("Tesla model 3");
    }
}
