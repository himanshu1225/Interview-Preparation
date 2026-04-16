package classlevelblock;

public class TestClassLock {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> CounterClass.test());
        Thread t2 = new Thread(() -> CounterClass.test());

        t1.start();
        t2.start();
//       👉 One after another ❌ parallel nahi
//
//      👉 Why?
//
//       Lock on class, not object
    }
}
