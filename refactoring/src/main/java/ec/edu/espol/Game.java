package ec.edu.espol;

public class Game {
    private Player p1;
    private Player p2;
    private RamdomChoiceFactory factory = new RamdomChoiceFactory();
    private int rounds = 1;
    private int draws = 0;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        boolean condition = gameCondition(p1.getScore(), p2.getScore());
        while (condition) {
            setChoices();
            showInitialBanner();
            int result = getComparation(p1.getChoice(), p2.getChoice());
            showRoundResults(result);
            setRoundResults(result);
            condition = gameCondition(p1.getScore(), p2.getScore());
        } 
        System.out.println("Game WON!");
    }

    private void setChoices() {
        p1.setChoice(factory.getRamdomChoice());
        p2.setChoice(factory.getRamdomChoice());
    }

    private void setRoundResults(int result) {
        rounds++;
        switch (result) {
            case 1:
                incrementScore(p1.getScore());
                break;
            case -1:
                incrementScore(p2.getScore());
                break;
            case 0:
                draws++;
                break;
        }
    }

    private void showRoundResults(int result) {
        switch (result) {
            case 1:
                System.out.println("Player 1 Wins");
                break;
            case -1:
                System.out.println("Player 2 Wins");
                break;
            case 0:
                System.out.println("Draw!");
                break;
        }
    }

    private int getComparation(Choice p1Choice, Choice p2Choice) {
        return p1Choice.compareTo(p2Choice);
    }

    private boolean gameCondition(Score player1Score, Score player2Score) {
        return player1Score.getWins() < 3 && player2Score.getWins() < 3;
    }

    private void incrementScore(Score score) {
        score.incrementWins();
    }
 
    private void showRound(){
        System.out.println("******* Round: " + rounds + " *******");
        System.out.println("\nNumber of Draws: " + draws);    
    }
    
    private void showPlayerChoice(Player player, int numberPlayer){
        Choice currentChoice = player.getChoice();
        Score currentPlayerScore = player.getScore();
        System.out.println("Player " + numberPlayer + ": " + currentChoice + " | Player " + numberPlayer + " Total Wins: " + currentPlayerScore.getWins());
    }
    
    private void showInitialBanner() {
        showRound();
        showPlayerChoice(p1, 1);
        showPlayerChoice(p2, 2);
    }
    
}