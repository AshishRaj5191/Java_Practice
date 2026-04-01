package lab_assignment_04.unit1.task10;

public class Main {
    public static void main(String[] args) {

        int[] marks1 = {85, 90, 80, 88, 92};
        Student s1 = new Student("Abc", 20, "MCA", "MCA01", marks1);

        int[] marks2 = {90, 95, 92, 94, 96};
        ScholarStudent s2 = new ScholarStudent("Xyz", 21, "MCA",
                "MCA02", marks2, 50000);

        System.out.println("---- Normal Student ----");
        s1.displayProfile();

        System.out.println("\n---- Scholar Student ----");
        s2.displayProfile();
    }
}