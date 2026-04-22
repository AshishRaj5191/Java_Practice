package lab_assignment_12.unit3.task11;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        ExamTask task = new ExamTask(85);

        Future<String> future = executor.submit(task);

        try {
            String result = future.get(3, TimeUnit.SECONDS);
            System.out.println("Exam Result: " + result);

        } catch (TimeoutException e) {
            System.out.println("Task timed out.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}
