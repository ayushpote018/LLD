import AnimalKingdom.AnimalKingdom;
import AnimalKingdom.Lion;
import AnimalKingdom.Sparrow;
import AnimalKingdom.Elephant;

public class Main {
    public static void main(String[] args) {
        AnimalKingdom lion = new Lion();
        lion.mobility();

        AnimalKingdom sparrow = new Sparrow();
        sparrow.mobility();

        AnimalKingdom elephant = new Elephant();
        elephant.mobility();
    }
}
