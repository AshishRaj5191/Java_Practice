package polymorphism.overloading;

public class Overloading_No {
    int sum(int no1) {
        return(no1 * 3);
    }
    int sum(int no1, int no2) {
        return(no1 + no2);
    }
    double sum(int no1, int no2, int no3) {
        return ((double) (no1 / no2) / no3);
    }
    public static void main(String[] args) {
        Overloading_No ob = new Overloading_No();
        System.out.println(ob.sum(5, 80, 37));
        System.out.println(ob.sum(5, 37));
        System.out.println(ob.sum(5));
        System.out.println(ob.sum(5, 80));
        System.out.println(ob.sum(5, 80, 37));
    }
}
