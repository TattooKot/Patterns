package main.java.com.tattookot.patterns.youtube.visitor;

public interface Developer {
    void createProjectClass(ProjectClass projectClass);
    void createDatabase(Database database);
    void createTest(Test test);
}
