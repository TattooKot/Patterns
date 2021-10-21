package main.java.com.tattookot.patterns.ownExamples.chain;

public class GunDefense extends SelfDefense{
    public GunDefense(int dangerLevel) {
        super(dangerLevel);
    }

    @Override
    public void write(String danger) {
        System.out.println("Shooting into " + danger);
    }
}
