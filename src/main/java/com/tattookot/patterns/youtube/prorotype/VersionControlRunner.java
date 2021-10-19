package main.java.com.tattookot.patterns.youtube.prorotype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super Project", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);
        System.out.println("=============");

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println(masterClone);
    }
}
