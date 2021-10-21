package main.java.com.tattookot.patterns.ownExamples.chain;

public abstract class SelfDefense {
    private int dangerLevel;
    private SelfDefense nextLevel;

    public SelfDefense(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public void setNextLevel(SelfDefense nextLevel) {
        this.nextLevel = nextLevel;
    }

    public void acting(String danger, int level){
        if(level >= dangerLevel){
            write(danger);
        }
        if(nextLevel != null){
            nextLevel.acting(danger, level);
        }
    }
    public abstract void write(String danger);
}
