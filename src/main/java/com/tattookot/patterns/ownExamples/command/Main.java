package main.java.com.tattookot.patterns.ownExamples.command;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter(
                new OrderBreakfast(chef),
                new OrderDinner(chef),
                new OrderSupper(chef)
        );

        waiter.bringBreakfast();
        waiter.bringDinner();
        waiter.bringSupper();
    }
}
