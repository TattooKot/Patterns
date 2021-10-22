package main.java.com.tattookot.patterns.ownExamples.memento;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game(new Player("Player", 1, 100));
        Savings savings = new Savings();

        System.out.println(game);
        savings.setSave(game.save());

        Player player1 = new Player("Player", 2, 400);
        game.setPlayer(player1);
        System.out.println(game);

        game.load(savings.getSave());
        System.out.println(game);
    }
}
