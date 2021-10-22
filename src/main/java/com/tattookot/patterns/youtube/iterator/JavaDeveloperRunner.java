package main.java.com.tattookot.patterns.youtube.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "spring", "hibernate", "maven", "posgresql"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Stanislav Kot", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer :" + javaDeveloper.getName());
        System.out.println("Skills: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
