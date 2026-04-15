import threadcreation.MyThread1;
import threadcreation.MyThread2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running at " +Thread.currentThread().getName());
        MyThread1 thread1 = new MyThread1();
        thread1.start();

//        Runnable is better because java does not support multiple interface
//        If you extend Thread:
//        ❌ You cannot extend another class
        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

    }
}