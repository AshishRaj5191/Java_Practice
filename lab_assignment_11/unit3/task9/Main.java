package lab_assignment_11.unit3.task9;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.getValue());
    }
}
