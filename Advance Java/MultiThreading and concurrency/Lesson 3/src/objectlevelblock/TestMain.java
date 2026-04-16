package objectlevelblock;

public class TestMain {
    public static void main(String[] args) {
        TestCounter c1 = new TestCounter();
        TestCounter c2 = new TestCounter();

        Thread t1 = new Thread(() -> c1.test());
        Thread t2 = new Thread(() -> c2.test());

        t1.start();
        t2.start();
//        Both run together ✅
//
//      👉 Why?
//
//      Different objects → different locks
    }
}
