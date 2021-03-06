package main.java.com.tattookot.patterns.youtube.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + ", we have some changes in our vacancies:\n" + vacancies +
                "\n==================\n");
    }
}
