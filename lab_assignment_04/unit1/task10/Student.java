package lab_assignment_04.unit1.task10;

public class Student extends Person {

    protected String program;
    protected String rollNumber;
    protected int[] marks;

    public Student(String name, int age, String program, String rollNumber, int[] marks) {
        super(name, age);
        this.program = program;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }

    public String assignGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }

    @Override
    public void displayProfile() {
        super.displayProfile();

        System.out.println("Program: " + program);
        System.out.println("Roll No: " + rollNumber);

        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
    }
}