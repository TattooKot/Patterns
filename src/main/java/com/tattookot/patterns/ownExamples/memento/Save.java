package main.java.com.tattookot.patterns.ownExamples.memento;

import java.util.Date;

public class Save {
    private final Player player;
    private final Date date;

    public Save(Player player) {
        this.player = player;
        this.date = new Date();
    }

    public Player getPlayer() {
        return player;
    }

    public Date getDate() {
        return date;
    }
}
