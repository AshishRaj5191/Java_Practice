import java.lang.reflect.Array;

public class Method_Overloading {

    // Simple Method
    // static int logic(int x, int y) {
    //     int z;
    //     if(x > y) {
    //         z = x + y;
    //     }
    //     else {
    //         z = (x + y) * 5;
    //     }
    //     return z;
    // }

    // Method invocation using object creation
    // int logic(int x, int y) {
    //     int z;
    //     if(x > y) {
    //         z = x + y;
    //     }
    //     else {
    //         z = (x + y) * 5;
    //     }
    //     return z;
    // }

    // Method Overloading
    // static int sum(int a, int b) {
    //     return a + b;
    // }

    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // static double sum(double a, double b) {
    //     return a + b;
    // }



    // By Reference Example

    // static void change(int x) {
    //     x = 98;
    // }

    static void change2(int arr[]) {
        arr[0] = 98;
    }



    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // int c;
        // Method_Overloading obj = new Method_Overloading();
        // c = obj.logic(a,b);




        // System.out.println("The value of c is: " + c);
        // System.out.println("Sum of 2 and 3 is: " + sum(2, 3));
        // System.out.println("Sum of 2, 3 and 4 is: " + sum(2, 3, 4));
        // System.out.println("Sum of 2.5 and 3.5 is: " + sum(2.5, 3.5));


        // Changing the integer value
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after changing is: " + x);

        // Changing the Array value
        int marks[] = {52, 67, 98, 78, 80};
        change2(marks);
        System.out.println("The value of first element after changing is: " + marks[0]);

    }
}
