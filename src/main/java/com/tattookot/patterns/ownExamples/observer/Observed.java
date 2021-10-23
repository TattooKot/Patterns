package main.java.com.tattookot.patterns.ownExamples.observer;

public interface Observed {
    void addCar(String car);
    void notifyAllSubscribers(String car);
}
