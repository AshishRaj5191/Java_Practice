package lab_assignment_11.unit3.task9;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getValue() {
        return count.get();
    }
}
