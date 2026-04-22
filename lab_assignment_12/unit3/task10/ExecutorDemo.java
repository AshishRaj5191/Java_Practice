package lab_assignment_12.unit3.task10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(
                        "Task " + taskId + " executed by " + Thread.currentThread().getName()
                    );
                }
            });
        }

        executor.shutdown();

        System.out.println("All tasks submitted.");
    }
}
