package main.java.com.tattookot.patterns.youtube.factory;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
