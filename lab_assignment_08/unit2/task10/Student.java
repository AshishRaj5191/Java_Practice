package lab_assignment_08.unit2.task10;

public class Student {

    private int studentId;
    private String name;
    private int marks;

    public Student(int studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return studentId + " - " + name + " - " + marks;
    }
}