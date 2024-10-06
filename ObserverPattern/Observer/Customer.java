package Observer;

public class Customer implements Observer{
    String name;
    public Customer(String name){
        this.name = name;
    }
    public void update(String status){
        System.out.println("Customer: "+name+" has been notified : "+status);
    }
}
