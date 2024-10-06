package PaymentProcessor;

public class BitcoinPayment implements PaymentProcessor{
    public void pay(int amount) {
        System.out.println(amount+" worth bitcoin deducted from your account...");
    }
}
