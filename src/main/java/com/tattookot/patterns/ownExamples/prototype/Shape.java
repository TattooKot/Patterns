package main.java.com.tattookot.patterns.ownExamples.prototype;

public class Shape implements Copyable{
    int x;
    int y;
    String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public Object copy() {
        return new Shape(x,y,color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
