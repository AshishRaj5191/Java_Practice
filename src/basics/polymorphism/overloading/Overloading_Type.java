package src.basics.polymorphism.overloading;

public class Overloading_Type {
    int sums(int no1, int no2) {
        return(no1 + no2);
    }
    long sums(long no1, int no2) {
        return((no1 / no2));
    }
    long sums(long no1, long no2) {
        return ((no1 - no2));
    }
    public static void main(String[] args) {
        int x = 5;
        long y = 10;
        Overloading_Type ob = new Overloading_Type();
        System.out.println(ob.sums(x, y));
    }
}//bclsifd