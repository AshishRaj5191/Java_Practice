package lab_assignment_05.unit2.task2.src.rules;

import lab_assignment_05.unit2.task2.src.model.AcademicRule;

public class PGRule extends AcademicRule {

    public PGRule(int marks) {
        super(marks);
    }

    @Override
    public int calculateCredits() {
        if (marks >= 85) return 5;
        else if (marks >= 70) return 4;
        else if (marks >= 50) return 3;
        else return 0;
    }
}
