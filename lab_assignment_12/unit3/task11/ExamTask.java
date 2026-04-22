package lab_assignment_12.unit3.task11;

import java.util.concurrent.Callable;

class ExamTask implements Callable<String> {

    private int marks;

    public ExamTask(int marks) {
        this.marks = marks;
    }

    @Override
    public String call() throws Exception {

        // Simulate delay
        Thread.sleep(2000);

        if (marks >= 90) return "Grade A";
        else if (marks >= 75) return "Grade B";
        else return "Grade C";
    }
}
