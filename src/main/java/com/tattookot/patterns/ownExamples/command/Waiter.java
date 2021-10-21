package main.java.com.tattookot.patterns.ownExamples.command;

public class Waiter {
    private Order breakfast;
    private Order dinner;
    private Order supper;

    public Waiter(Order breakfast, Order dinner, Order supper) {
        this.breakfast = breakfast;
        this.dinner = dinner;
        this.supper = supper;
    }

    public void bringBreakfast(){
        breakfast.notifyChef();
    }

    public void bringDinner(){
        dinner.notifyChef();
    }

    public void bringSupper(){
        supper.notifyChef();
    }
}
