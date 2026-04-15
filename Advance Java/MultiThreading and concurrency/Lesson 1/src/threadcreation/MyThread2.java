package threadcreation;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running in "+ Thread.currentThread().getName());
    }
}
