package Observer;

public class WareHouse implements Observer{
    String name;
    String location;
    public WareHouse(String name, String location){
        this.name = name;
        this.location = location;
    }
    public void update(String status){
        if(status=="Order Placed" || status=="Dispatched"){
            System.out.println("WareHouse: "+name+" at location : "+location+" has been notified that : "+status);
        }
    }
}
