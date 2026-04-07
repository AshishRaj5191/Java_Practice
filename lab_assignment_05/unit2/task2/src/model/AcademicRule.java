package lab_assignment_05.unit2.task2.src.model;

public abstract class AcademicRule {

    protected int marks;

    public AcademicRule(int marks) {
        this.marks = marks;
    }

    // Abstract method
    public abstract int calculateCredits();
}
