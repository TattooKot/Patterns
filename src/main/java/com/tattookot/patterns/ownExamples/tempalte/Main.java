package main.java.com.tattookot.patterns.ownExamples.tempalte;

public class Main {
    public static void main(String[] args) {
        Training legDay = new LegDay();
        Training backDay = new BackDay();

        legDay.train();
        System.out.println("=============");
        backDay.train();
    }
}
