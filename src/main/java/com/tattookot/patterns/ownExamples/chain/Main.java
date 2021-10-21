package main.java.com.tattookot.patterns.ownExamples.chain;

public class Main {
    public static void main(String[] args) {
        SelfDefense talking = new WordDefense(DangerLevel.CALM);
        SelfDefense fighting = new FightDefense(DangerLevel.DANGEROUS);
        SelfDefense shooting = new GunDefense(DangerLevel.WAR);

        talking.setNextLevel(fighting);
        fighting.setNextLevel(shooting);

        talking.acting("car driver", DangerLevel.CALM);
        System.out.println();
        talking.acting("alko brothers", DangerLevel.DANGEROUS);
        System.out.println();
        talking.acting("occupation", DangerLevel.WAR);
    }
}
