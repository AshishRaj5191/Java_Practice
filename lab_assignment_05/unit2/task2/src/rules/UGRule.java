package lab_assignment_05.unit2.task2.src.rules;

import lab_assignment_05.unit2.task2.src.model.AcademicRule;

public class UGRule extends AcademicRule {

    public UGRule(int marks) {
        super(marks);
    }

    @Override
    public int calculateCredits() {
        if (marks >= 80) return 4;
        else if (marks >= 60) return 3;
        else if (marks >= 40) return 2;
        else return 0;
    }
}
