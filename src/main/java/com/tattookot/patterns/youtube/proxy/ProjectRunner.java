package main.java.com.tattookot.patterns.youtube.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.google.com/");

        project.run();
    }
}
