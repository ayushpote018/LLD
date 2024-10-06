package MobilityStratergy;

public class BirdMobilityStratergy implements MobilityStratergy {
    public int legs = 2;

    @Override
    public void move() {
        System.out.println("I have " + legs + " legs and I love flying!!");
    }
}
