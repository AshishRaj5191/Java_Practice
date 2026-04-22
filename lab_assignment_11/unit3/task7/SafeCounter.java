package lab_assignment_11.unit3.task7;
class SafeCounter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class SafeCounterTask implements Runnable {

    private SafeCounter counter;

    public SafeCounterTask(SafeCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}