package lab_assignment_09.unit3.task1;

class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) 
            throws InvalidAgeException, InvalidMarkException {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (age < 17) {
            throw new InvalidAgeException("Age must be at least 17");
        }

        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks must be between 0 and 100");
        }

        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
