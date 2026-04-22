package lab_assignment_12.unit3.task12;

public class Main {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(new SafeTask(lock1, lock2), "Thread-1");
        Thread t2 = new Thread(new SafeTask(lock1, lock2), "Thread-2");

        t1.start();
        t2.start();
    }
}