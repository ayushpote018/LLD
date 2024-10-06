package MobilityStratergy;

public class AnimalMobilityStratergy implements MobilityStratergy {
    public int legs = 4;

    @Override
    public void move() {
        System.out.println("I have " + legs + " legs and I love walking!!");
    }
}
