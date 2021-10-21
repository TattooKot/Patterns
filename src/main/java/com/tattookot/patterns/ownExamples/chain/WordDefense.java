package main.java.com.tattookot.patterns.ownExamples.chain;

public class WordDefense extends SelfDefense{
    public WordDefense(int dangerLevel) {
        super(dangerLevel);
    }

    @Override
    public void write(String danger) {
        System.out.println("Word defense against " + danger);
    }
}
