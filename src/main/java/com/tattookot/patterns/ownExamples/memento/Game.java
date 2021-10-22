package main.java.com.tattookot.patterns.ownExamples.memento;

public class Game {
    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    Save save(){
        return new Save(player);
    }

    public void load(Save save){
        this.player = save.getPlayer();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "\nGame: " +
                "\n" + player +
                '\n';
    }
}
