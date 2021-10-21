package main.java.com.tattookot.patterns.ownExamples.command;

public class OrderSupper implements Order {
    private Chef chef;

    public OrderSupper(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void notifyChef() {
        chef.cookSupper();
    }
}
