package lab_assignment_11.unit3.task8;

class FlagDemo {

    volatile boolean running = true;

    public void startLoop() {
        System.out.println("Thread started...");

        while (running) {
        }

        System.out.println("Thread stopped!");
    }
}

public class VolatileDemo {

    public static void main(String[] args) throws InterruptedException {

        FlagDemo obj = new FlagDemo();

        Thread t = new Thread(() -> obj.startLoop());
        t.start();

        Thread.sleep(2000);

        System.out.println("Main thread changing flag...");
        obj.running = false;

        System.out.println("Flag changed to false");
    }
}