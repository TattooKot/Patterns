package main.java.com.tattookot.patterns.ownExamples.factory;

public class MmaVisitorFactory implements VisitorFactory{
    @Override
    public Visitor createVisitor() {
        return new MmaVisitor();
    }
}
