package lab_assignment_03.unit3.task7;

public class Student {

    // 🔹 Properties (Encapsulation: private)
    private String name;
    private int age;
    private String program;
    private String rollNumber;
    private int[] marks = new int[5];

    // 🔹 Constructor
    public Student(String name, int age, String program, String rollNumber, int[] marks) {
        setName(name);
        setAge(age);
        setProgram(program);
        setRollNumber(rollNumber);
        setMarks(marks);
    }

    // 🔹 Getters & Setters (with validation)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        if (program != null && !program.isEmpty()) {
            this.program = program;
        }
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        if (rollNumber != null && !rollNumber.isEmpty()) {
            this.rollNumber = rollNumber;
        }
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        if (marks.length == 5) {
            for (int m : marks) {
                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks detected!");
                    return;
                }
            }
            this.marks = marks;
        } else {
            System.out.println("Marks must be of size 5!");
        }
    }

    // 🔹 Method: Calculate Average
    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / 5.0;
    }

    // 🔹 Method: Assign Grade
    public String assignGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }

    // 🔹 Method: Display Profile
    public void displayProfile() {
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Roll No: " + rollNumber);

        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Grade: " + assignGrade());
    }
}
