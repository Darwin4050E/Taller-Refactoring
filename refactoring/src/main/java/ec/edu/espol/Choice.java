package ec.edu.espol;

public interface Choice {
    
    int compareTo(Choice anotherChoice);

    public default boolean comparableStructure(Choice anotherChoice, String comparate){
        String nameChoice = anotherChoice.toString();
        return nameChoice.equals(comparate);
    }

}