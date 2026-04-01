package lab_assignment_04.unit1.task13;

public class SafeStudent {

    private String name;
    private int age;
    private int[] marks = new int[5];

    public SafeStudent(String name, int age) throws InvalidAgeException {
        this.name = name;

        if (age < 17) {
            throw new InvalidAgeException("Age must be >= 17");
        }
        this.age = age;
    }

    public void setMarks(int[] marks) throws InvalidMarkException {
        if (marks.length != 5) {
            throw new InvalidMarkException("Exactly 5 marks required");
        }

        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be 0–100");
            }
        }
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / 5.0;
    }

    public void displayProfile() {
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");

        System.out.println("\nAverage: " + calculateAverage());
    }
}