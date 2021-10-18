package main.java.com.tattookot.patterns.youtube.abstractFactory.website;

import main.java.com.tattookot.patterns.youtube.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes code for website project...");
    }
}
