package lab_assignment_04.unit1.task11;

public class Main {
    public static void main(String[] args) {

        int[] marks1 = {80, 85, 78, 82, 88};
        int[] marks2 = {90, 95, 92, 94, 96};

        Person p1 = new Student("Rahul", 20, "MCA", "MCA01", marks1);

        Person p2 = new ScholarStudent("Anita", 21, "MCA","MCA02", marks2, 50000);

        System.out.println("---- Using Person Reference ----");

        p1.displayProfile();
        System.out.println();

        p2.displayProfile();
    }
}
