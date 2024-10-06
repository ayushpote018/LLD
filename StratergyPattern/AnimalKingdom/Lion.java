package AnimalKingdom;
import MobilityStratergy.AnimalMobilityStratergy;

public class Lion extends AnimalKingdom {

    public Lion() {
        super(new AnimalMobilityStratergy());
    }

    @Override
    public void mobility() {
        System.out.print("Lion: ");
        super.mobility();
    }
}
