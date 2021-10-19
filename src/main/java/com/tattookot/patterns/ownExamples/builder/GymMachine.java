package main.java.com.tattookot.patterns.ownExamples.builder;

public class GymMachine {
    private String name;
    private Type type;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GymMachine{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
