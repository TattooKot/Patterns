package main.java.com.tattookot.patterns.ownExamples.prototype;

public class ShapeFactory {
    Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    Shape cloneShape(){
        return (Shape) shape.copy();
    }
}
