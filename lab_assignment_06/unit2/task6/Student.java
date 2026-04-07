package lab_assignment_06.unit2.task6;

public class Student {

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}
