package lock;

public class Counter {
    int count = 0;

    synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
        }
        System.out.println("Counter increased by "+ Thread.currentThread().getName()
        + " and its value is now "+ count );
    }
}
