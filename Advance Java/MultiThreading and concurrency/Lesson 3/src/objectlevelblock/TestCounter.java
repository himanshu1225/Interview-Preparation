package objectlevelblock;

public class TestCounter {
    synchronized void test() {
        System.out.println(Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}
