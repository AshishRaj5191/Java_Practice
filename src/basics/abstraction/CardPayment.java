package src.basics.abstraction;

public class CardPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment done via Card");
    }
}
