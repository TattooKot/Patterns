package main.java.com.tattookot.patterns.ownExamples.visitor;

public class Gym {
    public static void main(String[] args) {
        Sportsman powerlifter = new Powerlifter();
        Sportsman bodybuilder = new Bodybuilder();

        WeekSplit split = new WeekSplit();

        System.out.println("Powerlifter do his split...");
        split.doSplit(powerlifter);

        System.out.println("=============");

        System.out.println("Bodybuilder do his split...");
        split.doSplit(bodybuilder);

    }
}
