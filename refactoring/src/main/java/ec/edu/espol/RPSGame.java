package ec.edu.espol;

public class RPSGame {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Game game = new Game(p1, p2);
        game.start();
    }
}