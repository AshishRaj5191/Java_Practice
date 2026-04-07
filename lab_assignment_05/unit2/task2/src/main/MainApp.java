package lab_assignment_05.unit2.task2.src.main;

import lab_assignment_05.unit2.task2.src.model.AcademicRule;
import lab_assignment_05.unit2.task2.src.rules.UGRule;
import lab_assignment_05.unit2.task2.src.rules.PGRule;

public class MainApp {

    public static void main(String[] args) {

        AcademicRule rule;

        rule = new UGRule(75);
        System.out.println("UG Credits: " + rule.calculateCredits());

        rule = new PGRule(75);
        System.out.println("PG Credits: " + rule.calculateCredits());
    }
}
