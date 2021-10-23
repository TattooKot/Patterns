package main.java.com.tattookot.patterns.ownExamples.observer;

import java.util.ArrayList;
import java.util.List;

public class Manheim implements Observed{
    private List<Observer> dealers = new ArrayList<>();

    public void addDealer(Observer observer){
        dealers.add(observer);
    }

    public void removeDealer(Observer observer){
        dealers.remove(observer);
    }

    @Override
    public void addCar(String car) {
        notifyAllSubscribers(car);
    }

    @Override
    public void notifyAllSubscribers(String car) {
        dealers.forEach(d -> d.newCar(car));
    }
}
