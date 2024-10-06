package Subject;
import Observer.Observer;

public interface  Order {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String status);
}
