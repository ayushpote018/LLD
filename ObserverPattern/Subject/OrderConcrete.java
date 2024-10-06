package Subject;
import java.util.ArrayList;
import Observer.Observer;

public class OrderConcrete implements Order{
    private ArrayList<Observer> observers;

    private String status;

    public OrderConcrete(){
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status){
        this.status = status;
        notifyObservers(status);
    }
}
