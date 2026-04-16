package srcc.basics.iteration;

import java.util.*;

class IterationDemo {
    private Iterator<String> iterator;

    public IterationDemo(List<String> names) {
        this.iterator = names.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public String next() {
        return iterator.next();
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Avocado");

        IterationDemo demo = new IterationDemo(names);

        while (demo.hasNext()) {
            String name = demo.next();
            System.out.println("Element: " + name);
        }
    }
}