package main.java.com.tattookot.patterns.youtube.visitor;

public class Database implements ProjectElement{
    @Override
    public void beenWritten(Developer developer) {
        developer.createDatabase(this);
    }
}
