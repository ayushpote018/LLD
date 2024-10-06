package AnimalKingdom;

import MobilityStratergy.MobilityStratergy;

public class AnimalKingdom {
    MobilityStratergy mobilityStratergy;

    public AnimalKingdom(MobilityStratergy mobilityStratergy) {
        this.mobilityStratergy = mobilityStratergy;
    }

    public void mobility() {
        mobilityStratergy.move();
    }
}
