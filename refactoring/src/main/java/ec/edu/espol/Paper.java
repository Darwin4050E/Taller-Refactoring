package ec.edu.espol;

public class Paper implements Choice {

    @Override
    public int compareTo(Choice anotherChoice) {
        if(defeatsRock(anotherChoice)) 
            return 1;
        else if(isEquals(anotherChoice))
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Paper";
    }

    private boolean defeatsRock(Choice anotherChoice){
        return comparableStructure(anotherChoice, "Rock");
    }

    private boolean isEquals(Choice anotherChoice){
        return comparableStructure(anotherChoice, this.toString());
    }
}