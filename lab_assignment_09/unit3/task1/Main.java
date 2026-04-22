package lab_assignment_09.unit3.task1;

public class Main {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("Rahul", 18, 90);
            s1.display();
        } 
        catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        } 
        catch (InvalidMarkException e) {
            System.out.println("Marks Error: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Name Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Done");
        }
    }
}
