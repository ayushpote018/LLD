import PaymentProcessor.*;

public class Main {
    public static void main(String[] args){
        PaymentProcessor paymentProcessor = new UPIPayment();
        Payment payment = new Payment(paymentProcessor);
        payment.pay(100);

        paymentProcessor = new CreditCardPayment();
        payment = new Payment(paymentProcessor);
        payment.pay(200);

        paymentProcessor = new BitcoinPayment();
        payment = new Payment(paymentProcessor);
        payment.pay(300);
    }
}
