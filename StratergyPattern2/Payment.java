import PaymentProcessor.PaymentProcessor;

public class Payment {
    PaymentProcessor paymentProcessor;

    public Payment(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;   
    }

    public void pay(int amount){
        this.paymentProcessor.pay(amount);
    }
}
