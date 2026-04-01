package lab_assignment_04.unit1.task10;

public class ScholarStudent extends Student {

    private double scholarshipAmount;

    public ScholarStudent(String name, int age, String program,
                          String rollNumber, int[] marks, double scholarshipAmount) {

        super(name, age, program, rollNumber, marks);
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public String assignGrade() {
        double avg = calculateAverage();

        if (avg >= 85) return "A+ (Scholar)";
        else return super.assignGrade();
    }

    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Scholarship: ₹" + scholarshipAmount);
    }
}
