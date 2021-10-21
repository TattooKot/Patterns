package main.java.com.tattookot.patterns.ownExamples.command;

public class OrderDinner implements Order {
    private Chef chef;

    public OrderDinner(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void notifyChef() {
        chef.cookDinner();
    }
}
