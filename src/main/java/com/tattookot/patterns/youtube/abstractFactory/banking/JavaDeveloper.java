package main.java.com.tattookot.patterns.youtube.abstractFactory.banking;

import main.java.com.tattookot.patterns.youtube.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes code for banking project..");
    }
}
