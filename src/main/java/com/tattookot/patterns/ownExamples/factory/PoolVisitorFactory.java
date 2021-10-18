package main.java.com.tattookot.patterns.ownExamples.factory;

public class PoolVisitorFactory implements VisitorFactory{
    @Override
    public Visitor createVisitor() {
        return new PoolVisitor();
    }
}
