package ec.edu.espol;

public class Scissors implements Choice {

    @Override
    public int compareTo(Choice anotherChoice) {
        if(defeatsPaper(anotherChoice)) 
            return 1;
        else if(isEquals(anotherChoice))
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Scissors";
    }

    private boolean defeatsPaper(Choice anotherChoice){
        return comparableStructure(anotherChoice, "Paper");
    }

    private boolean isEquals(Choice anotherChoice){
        return comparableStructure(anotherChoice, this.toString());
    }
    
}