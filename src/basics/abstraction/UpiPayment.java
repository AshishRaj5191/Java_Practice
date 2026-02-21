package src.basics.abstraction;

public class UpiPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment done via UPI");
    }
}
