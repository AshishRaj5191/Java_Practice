package lab_assignment_04.unit1.task13;

public class Main {
    public static void main(String[] args) {

        try {
            SafeStudent s = new SafeStudent("Rahul", 18);

            int[] marks = {85, 90, 78, 88, 92};
            s.setMarks(marks);

            s.displayProfile();

        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());

        } catch (InvalidMarkException e) {
            System.out.println("Mark Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Invalid index access!");

        } finally {
            System.out.println("\nSystem execution completed safely.");
        }
    }
}