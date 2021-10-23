package main.java.com.tattookot.patterns.youtube.strategy;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute(){
        activity.justDoIt();
    }
}
