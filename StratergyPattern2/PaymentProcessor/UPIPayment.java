package PaymentProcessor;

public class UPIPayment implements PaymentProcessor{
    public void pay(int amount){
        System.out.println(amount+" deducted from your account though UPI..!");
    }
}
