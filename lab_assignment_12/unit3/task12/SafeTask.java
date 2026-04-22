package lab_assignment_12.unit3.task12;

class SafeTask implements Runnable {

    private Object lock1;
    private Object lock2;

    public SafeTask(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }
}
