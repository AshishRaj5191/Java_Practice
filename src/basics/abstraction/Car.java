package abstraction;

public class Car extends Vehicle
{
    @Override
    void move()
    {
        System.out.println("Car drives four wheels");
    }
}