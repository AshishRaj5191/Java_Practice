package lab_assignment_08.unit2.task12;

import java.util.*;

public class StudentService {

    private List<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
    }

    public Optional<Student> findById(int id) {
        return list.stream()
                .filter(s -> s.getStudentId() == id)
                .findFirst();
    }
}
