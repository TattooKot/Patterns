package main.java.com.tattookot.patterns.ownExamples.chain;

public class FightDefense extends SelfDefense{
    public FightDefense(int dangerLevel) {
        super(dangerLevel);
    }

    @Override
    public void write(String danger) {
        System.out.println("Fight against " + danger);
    }
}
