package lab_assignment_12.unit3.task12;

class DeadlockTask2 implements Runnable {

    private Object lock1;
    private Object lock2;

    public DeadlockTask2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("Thread-2 acquired lock2");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (lock1) {
                System.out.println("Thread-2 acquired lock1");
            }
        }
    }
}