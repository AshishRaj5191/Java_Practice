package lab_assignment_09.unit3.task2;

public class ExceptionDemoMain {
    public static void main(String[] args) {

        ExceptionDemo obj = new ExceptionDemo();

        try {
            obj.performOperation();
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index");
        } 
        catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed (Cleanup done)");
        }

        System.out.println("Program continues...");
    }
}