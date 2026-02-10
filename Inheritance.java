class Base {
    int x;

    public void setX(int x) {
        System.out.println("I am setting X now...");
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void display() {
        System.out.println("I am a Constructor");
    }
}

class Derived extends Base {
    int y;

    public void setY(int y) {
        System.out.println("I am setting Y now...");
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(10);
        System.out.println("Value of X: " + b.getX());
        
        Derived d = new Derived();
        d.setX(20);
        System.out.println("Value of X: " + d.getX());
        d.setY(20);
        System.out.println("Value of Y: " + d.getY());
        
    }
}