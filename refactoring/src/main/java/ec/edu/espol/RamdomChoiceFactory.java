package ec.edu.espol;

import java.util.ArrayList;
import java.util.List;

public class RamdomChoiceFactory {

    private final List<Choice> choices = new ArrayList<Choice>();
    
    public RamdomChoiceFactory() {
        choices.add(new Rock());
        choices.add(new Scissors());
        choices.add(new Paper());
    }

    public int getRamdomNumber() {
        return (int)(Math.random() * 3);
    }

    public Choice getRamdomChoice() {
        return choices.get(getRamdomNumber());
    }
    
}