package Observer;

public class DeliveryAgent implements Observer{
    String name;
    public DeliveryAgent(String name){
        this.name = name;
    }
    public void update(String status){
        if(status=="Out for Delivery" || status=="Delivered"){
            System.out.println("Delivery Agent: "+name+" has been notified that : "+status);
        }
    }
}
