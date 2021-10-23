package main.java.com.tattookot.patterns.youtube.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
