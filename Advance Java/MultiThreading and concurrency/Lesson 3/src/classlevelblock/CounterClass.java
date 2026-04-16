package classlevelblock;

public class CounterClass {
    static synchronized void test() {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("Wait.......");
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}
