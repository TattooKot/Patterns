package main.java.com.tattookot.patterns.youtube.visitor;

public class Test implements ProjectElement{
    @Override
    public void beenWritten(Developer developer) {
        developer.createTest(this);
    }
}
