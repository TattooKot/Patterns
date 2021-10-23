package main.java.com.tattookot.patterns.youtube.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beenWritten(juniorDeveloper);

        System.out.println("=============");
        System.out.println("Senior in action...");
        project.beenWritten(seniorDeveloper);
    }
}
