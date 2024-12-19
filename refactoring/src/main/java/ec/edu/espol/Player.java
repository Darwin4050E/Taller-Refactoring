package ec.edu.espol;

public class Player {
    
    private Choice choice;
    private Score score;

    public Player() {
        this.score = new Score();
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return this.choice;
    }

    public Score getScore() {
        return this.score;
    }

}
