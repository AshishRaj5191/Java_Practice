package lab_assignment_03.unit3.task9;

public class StudentAdmission {
    // 🔹 Properties
    private String name;
    private int age;
    private String program;
    private int year;
    private String rollNumber;

    private static int counter = 1; // for auto roll generation

    // 🔹 Constructor
    public StudentAdmission(String name, int age, String program, int year) {
        setName(name);
        setAge(age);
        setProgram(program);
        setYear(year);
        generateRollNumber();
    }

    // 🔹 Auto Roll Number Generator
    private void generateRollNumber() {
        this.rollNumber = program.toUpperCase() + "_STU_" + counter++;
    }

    // 🔹 Setters with Validation

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setAge(int age) {
        if (age >= 17) {
            this.age = age;
        } else {
            System.out.println("Admission Failed: Age must be >= 17");
        }
    }

    public void setProgram(String program) {
        if (program.equalsIgnoreCase("MCA") ||
            program.equalsIgnoreCase("BCA") ||
            program.equalsIgnoreCase("BTECH")) {

            this.program = program;
        } else {
            System.out.println("Invalid Program! Allowed: MCA, BCA, BTECH");
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 4) {
            this.year = year;
        } else {
            System.out.println("Invalid Year! Must be between 1 and 4");
        }
    }

    // 🔹 Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getProgram() { return program; }
    public int getYear() { return year; }
    public String getRollNumber() { return rollNumber; }

    // 🔹 Display Method
    public void display() {
        System.out.println("\n--- Admission Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
        System.out.println("Roll No: " + rollNumber);
    }
}
