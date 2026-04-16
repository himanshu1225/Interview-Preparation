package synchronizedEx;

public class Counter {
    public int count = 0;

    public synchronized void increment() {
        count++; // without sync key word koi bhi thread 1 ya 2 me se aa skta aur usse read krke write kr sakta
//        System.out.println(Thread.currentThread().getName());
    }
}
