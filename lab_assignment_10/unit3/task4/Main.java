package lab_assignment_10.unit3.task4;

public class Main {
    public static void main(String[] args) {

        MyRunnable task1 = new MyRunnable();
        Thread t1 = new Thread(task1);
        t1.setName("Thread-1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                }
            }
        });
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}