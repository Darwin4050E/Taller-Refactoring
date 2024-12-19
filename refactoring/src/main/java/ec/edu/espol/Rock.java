package ec.edu.espol;

public class Rock implements Choice {

    @Override
    public int compareTo(Choice anotherChoice) {
        if(defeatsScissors(anotherChoice)) 
            return 1;
        else if(isEquals(anotherChoice))
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Rock";
    }    

    private boolean defeatsScissors(Choice anotherChoice){
        return comparableStructure(anotherChoice, "Scissors");
    }

    private boolean isEquals(Choice anotherChoice){
        return comparableStructure(anotherChoice, this.toString());
    }
    
}