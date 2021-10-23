package main.java.com.tattookot.patterns.youtube.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beenWritten(Developer developer) {
        developer.createProjectClass(this);
    }
}
