import java.util.ArrayList;
import Subject.*;
import Observer.*;

public class Main {
    public static void main(String[] args) {
        Observer Ayaan = new Customer("Ayaan");
        Observer Swayam = new Customer("Swayam");

        Observer Nitin = new DeliveryAgent("Nitin");
        Observer Abhinav = new DeliveryAgent("Abhinav");

        Observer wareHouse = new WareHouse("123warehouse", "Baner, Pune");
        Observer wareHouse2 = new WareHouse("456warehouse", "Katraj, Pune");

        OrderConcrete order = new OrderConcrete();
        order.addObserver(Ayaan);
        order.addObserver(Swayam);
        order.addObserver(Nitin);
        order.addObserver(Abhinav);
        order.addObserver(wareHouse);
        order.addObserver(wareHouse2);

        order.setStatus("Order Placed");
        order.setStatus("Dispatched");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");
    }
}
