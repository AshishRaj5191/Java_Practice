package srcc.basics.iteration;
import java.util.*;

public class SafeRemovalDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Element: " + name);
            if (name.equals("Bob")) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + names);
    }
}
