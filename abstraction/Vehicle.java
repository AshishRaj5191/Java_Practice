package abstraction;
public abstract class Vehicle
{
    void start()
    {
        System.out.println("Vehicle Starting...");
    }

    abstract void move();
}