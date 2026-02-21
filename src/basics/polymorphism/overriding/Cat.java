package src.basics.polymorphism.overriding;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat Meow ");
    }

}
