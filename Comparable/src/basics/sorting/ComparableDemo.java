package Comparable.src.basics.sorting;
import java.util.*;

class ComparableStudent implements Comparable<ComparableStudent> {
    private int id;
    private String name;

    public ComparableStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableStudent o) {
        // Sort by marks in descending order
        return Integer.compare(this.id,o.id);
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<ComparableStudent> list = new ArrayList<>();
        list.add(new ComparableStudent(3, "Alice"));
        list.add(new ComparableStudent(1, "Bob"));
        list.add(new ComparableStudent(2, "Charlie"));

        Collections.sort(list);

        for (ComparableStudent student : list) {
            System.out.println(student);
        }
    }
}
