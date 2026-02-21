package src.basics.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        // Child Class
        Student s = new Student();
        s.name = "Ashish";   // Inherited field
        s.age = 22;          // Inherited field
        s.setMarks(80);      // Class specific

        s.printStudentInfo();
    }
}
