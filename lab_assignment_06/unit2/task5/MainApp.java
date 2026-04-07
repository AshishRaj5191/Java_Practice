package lab_assignment_06.unit2.task5;

public class MainApp {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student(101, "Rahul"));
        service.addStudent(new Student(102, "Amit"));

        service.getStudentById(101);

        service.getStudentById(999);
    }
}
