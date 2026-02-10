public class Recursion {
    static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5; // Example number
        int result = fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}