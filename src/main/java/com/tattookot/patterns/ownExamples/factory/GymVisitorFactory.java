package main.java.com.tattookot.patterns.ownExamples.factory;

public class GymVisitorFactory implements VisitorFactory{
    @Override
    public Visitor createVisitor() {
        return new GymVisitor();
    }
}
