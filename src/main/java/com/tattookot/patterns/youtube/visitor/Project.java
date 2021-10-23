package main.java.com.tattookot.patterns.youtube.visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beenWritten(Developer developer) {
        for(ProjectElement element : projectElements){
            element.beenWritten(developer);
        }
    }
}
