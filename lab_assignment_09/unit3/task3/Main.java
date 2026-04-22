package lab_assignment_09.unit3.task3;

public class Main {

    public static String calculateGrade(int marks) {

        int result = marks / 0;

        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else return "C";
    }

    public static void processExamResult(int marks) 
            throws ResultProcessingException {

        try {
            String grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        } 
        catch (Exception e) {

            throw new ResultProcessingException("Processing failed", e);
        }
    }

    public static void main(String[] args) {

        try {
            processExamResult(85);
        } 
        catch (ResultProcessingException e) {

            System.out.println("Custom Exception: " + e.getMessage());

            System.out.println("\n--- Full Stack Trace ---");
            e.printStackTrace();

            System.out.println("\n--- Root Cause ---");
            System.out.println(e.getCause());
        }
    }
}
