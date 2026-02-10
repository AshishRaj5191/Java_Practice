package abstraction;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.start();
        v.move();


        // v = new Bike();
        // v.start();
        // v.move();
    }
}
