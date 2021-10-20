package main.java.com.tattookot.patterns.ownExamples.prototype;

public class Drawing {
    public static void main(String[] args) {
        Shape master = new Shape(1,2, "green");
        System.out.println(master);
        System.out.println("=========");
        ShapeFactory factory = new ShapeFactory(master);
        Shape copyMaster = factory.cloneShape();
        System.out.println(copyMaster);
    }
}