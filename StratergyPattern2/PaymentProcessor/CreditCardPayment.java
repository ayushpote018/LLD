package PaymentProcessor;

public class CreditCardPayment implements PaymentProcessor{
    public void pay(int amount){
        System.out.println(amount+" deducted from your Credit Card..");
    }
}
