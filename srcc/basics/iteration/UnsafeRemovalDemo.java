package srcc.basics.iteration;
import java.util.*;

public class UnsafeRemovalDemo {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");

        for (String name : items) {
            System.out.println("Element: " + name);
            if (name.equals("Banana")) {
                items.remove(name); // This will cause ConcurrentModificationException
            }
        }

        System.out.println("After removal: " + items);
    }
}
