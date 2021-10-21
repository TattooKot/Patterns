package main.java.com.tattookot.patterns.ownExamples.command;

public class OrderBreakfast implements Order{
    private Chef chef;

    public OrderBreakfast(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void notifyChef() {
        chef.cookBreakfast();
    }
}
