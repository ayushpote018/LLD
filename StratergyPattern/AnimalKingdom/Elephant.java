package AnimalKingdom;
import MobilityStratergy.AnimalMobilityStratergy;

public class Elephant extends AnimalKingdom{
    public Elephant(){
        super(new AnimalMobilityStratergy());
    }
    public void mobility(){
        System.out.print("Elephant: ");
        super.mobility();
    }
}
