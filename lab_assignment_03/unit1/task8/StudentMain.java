package lab_assignment_03.unit1.task8;

public class StudentMain {
    public static void main(String[] args) {

        // 🔹 Step 1: Create 5 Student objects
        Student[] students = new Student[5];

        students[0] = new Student("Rahul", 20, "MCA", "MCA2025_STU_01",
                new int[]{80, 85, 90, 75, 88});

        students[1] = new Student("Anita", 21, "MCA", "MCA2025_STU_02",
                new int[]{70, 65, 78, 72, 68});

        students[2] = new Student("Vikash", 22, "MCA", "MCA2025_STU_03",
                new int[]{90, 92, 88, 95, 91});

        students[3] = new Student("Sneha", 20, "MCA", "MCA2025_STU_04",
                new int[]{60, 58, 65, 62, 61});

        students[4] = new Student("Amit", 23, "MCA", "MCA2025_STU_05",
                new int[]{85, 80, 82, 88, 86});

        // 🔹 Step 2: Update marks (manipulation)
        students[1].setMarks(new int[]{75, 70, 80, 78, 72}); // updated Anita
        students[3].setMarks(new int[]{65, 68, 70, 72, 66}); // updated Sneha

        // 🔹 Step 3: Print summary cards
        System.out.println("===== STUDENT SUMMARY CARDS =====");

        for (int i = 0; i < students.length; i++) {
            students[i].displayProfile();
        }
    }
}
