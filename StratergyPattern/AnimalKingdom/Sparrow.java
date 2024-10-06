package AnimalKingdom;
import MobilityStratergy.BirdMobilityStratergy;

public class Sparrow extends AnimalKingdom {

    public Sparrow() {
        super(new BirdMobilityStratergy());
    }

    @Override
    public void mobility() {
        System.out.print("Sparrow: ");
        super.mobility();
    }
}
