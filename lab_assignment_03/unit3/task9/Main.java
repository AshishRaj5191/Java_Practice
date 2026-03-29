package lab_assignment_03.unit3.task9;

public class Main {
    public static void main(String[] args) {

        // ✅ Valid Student
        StudentAdmission s1 = new StudentAdmission("Rahul", 18, "MCA", 2);
        s1.display();

        // ❌ Invalid Age
        StudentAdmission s2 = new StudentAdmission("Amit", 16, "BCA", 1);

        // ❌ Invalid Program
        StudentAdmission s3 = new StudentAdmission("Sneha", 19, "MBA", 2);

        // ❌ Invalid Year
        StudentAdmission s4 = new StudentAdmission("Vikas", 20, "BTECH", 5);
    }
}
