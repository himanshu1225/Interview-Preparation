package threadcreation;

public class MyThread1 extends Thread{
    public void run(){
        System.out.println("Running in "+ Thread.currentThread().getName());
    }
}
