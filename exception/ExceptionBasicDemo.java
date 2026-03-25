package exception;

public class ExceptionBasicDemo {
    public static void main(String[] args) {
        // try {
        //     int x = 10 / 0;
        //     System.out.println(x);
        // } catch (ArithmeticException e) {
        //     System.out.println("Cannot divide by zero");
        // }

        // System.out.println("Hello World");

        // String n = null;
        // try {
        //     System.out.println(n.toUpperCase());
        // } 
        // catch (NullPointerException e) {
        //     System.out.println(e.getMessage());
        //     // System.out.println("String is null");
        // }
        // finally {
        //     System.out.println("This will execute always");
        // }

        // int arr [] = {1,2,3};
        // try {
        //     System.out.println(arr[5]);
        // } 
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e.getMessage());
        // }
        // finally {
        //     System.out.println("This will execute always");
        // }

        try {
            String n = "a";
            int num = Integer.parseInt(n); // NumberFormatException
            System.out.println(num);
        } 
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will execute always");
        }
    }
}
//WAP to assign a null string value to a string object and convert it into upper case without showing an error.
// even we can dircet write integer.parseint why we make object of integer class because parseInt is a static method of Integer class so we can call it directly using class name without creating an object of Integer class.

