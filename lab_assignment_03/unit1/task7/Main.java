package lab_assignment_03.unit1.task7;

public class Main {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 88, 92};

        Student s1 = new Student(
                "Ashish",
                20,
                "MCA",
                "MCA2025_STU_01",
                marks
        );

        s1.displayProfile();
    }
}
