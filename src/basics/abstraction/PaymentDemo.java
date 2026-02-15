package abstraction;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p;
        p = new UpiPayment();
        p.pay();
        p.pay();

        p = new CardPayment();
        p.pay();
        p.pay();
    }
}
