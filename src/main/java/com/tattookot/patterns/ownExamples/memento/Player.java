package main.java.com.tattookot.patterns.ownExamples.memento;

public class Player {
    private String name;
    private int level;
    private int money;

    public Player(String name, int level, int money) {
        this.name = name;
        this.level = level;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player:" +
                "\nName: " + name +
                "\nLevel: " + level +
                "\nMoney: " + money;
    }
}
