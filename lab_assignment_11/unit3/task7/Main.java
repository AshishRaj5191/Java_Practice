package lab_assignment_11.unit3.task7;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SafeCounter counter = new SafeCounter();

        Thread t1 = new Thread(new SafeCounterTask(counter));
        Thread t2 = new Thread(new SafeCounterTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}
