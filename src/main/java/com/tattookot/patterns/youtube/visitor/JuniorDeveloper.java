package main.java.com.tattookot.patterns.youtube.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void createProjectClass(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void createDatabase(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void createTest(Test test) {
        System.out.println("Write not reliable test..");
    }
}
