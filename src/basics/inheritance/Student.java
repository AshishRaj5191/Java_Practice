package inheritance;

public class Student extends Person{
    private int marks;

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public void printStudentInfo() {
        printPersonInfo();
        System.out.println("Marks: " + marks);
    }
}
