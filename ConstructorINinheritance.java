class Principle {
    Principle() {
        System.out.println("I am a base Constructor");
    }

    Principle(int x) {
        System.out.println("I am a base class constructor with value as X = " + x);
    }
}

class Teacher extends Principle {
    Teacher() {
        System.out.println("I am a Teacher class Constructor");
    }

    Teacher(int x, int y) {
        super(x);
        System.out.println("I am an Overloaded Constructor of Teacher class with value of Y as = " + y);
    }
}

class Student extends Teacher {
    Student() {
        System.out.println("I am Student class Constructor ");
    }

    Student(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an Overloaded Constructor of Teacher class with value of Z  as = " + z);
    }
}

public class ConstructorINinheritance {
    public static void main(String[] args) {
        // Principle p = new Principle(5);
        // Teacher t = new Teacher(34, 45);
        // Student s = new Student(23,34,45);
        Student s = new Student();

         
    }
}
