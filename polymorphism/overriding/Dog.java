package polymorphism.overriding;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
