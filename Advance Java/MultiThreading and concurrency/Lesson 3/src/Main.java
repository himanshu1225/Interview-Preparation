import synchronizedEx.Counter;
import synchronizedEx.Printer;

public class Main{
    public static void main(String[] args) throws InterruptedException {
//        synchronized ensures that only ONE thread executes a block of code at a time
//        🔒 1. synchronized prevents race condition
//        ❌ Without synchronized (Race Condition)
        Counter c = new Counter();

        Thread t1 = new Thread(
                ()->{
                    for (int i = 0; i < 1000; i++) {
                        c.increment();
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        c.increment();
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();
//         👉 Iska matlab:
//        “Main thread wait karega jab tak t1 aur t2 finish na ho jaye”
//          ye synchronization (data safety) provide nahi karta
//        join() ensure krta hai "Final print tab hoga jab dono threads complete ho jaye"
//       ❌ Without join(): 0 / 500 / random kuch bhi value de sakta count ki
//        Because thread ka operation complete nahi hua and main thread print kr degi


        System.out.println("count value: "+ c.count);

//        Now add synchronized to increment method then see:
//          Ek time pe ek thread hi increment() me ja raha hai

//        🔒 2. Lock required to enter critical section (another example)
        Printer printer = new Printer();
        Thread t3 = new Thread(
                () -> printer.print("DOC1")
        );

        Thread t4 = new Thread(  () -> printer.print("DOC2"));

        t3.start();
        t4.start();
//  ❌ This won't happen:
//      Start Doc1
//      Start Doc2
//      End Doc1
//      End Doc2
//
//  👉 Because:
//     Lock ke bina entry nahi milegi

//     🧩 3. Object-level vs Class-level Lock
//        1. object level block:
//        Different objects → different locks

//        2. class level block
//        👉 One after another ❌ parallel nahi
//        👉 Why?
//         Lock on class, not object


//        ⚡ 4. Block vs Method (Performance)
//        ❌ Method-level (Bad for performance)

//        class Task {
//          synchronized void process() {
//        // long code
//        for (int i = 0; i < 100000; i++) {
//            System.out.println("Processing...");
//        }
//    }
//}

//        👉 Entire method locked → slow

//        ✅ Block-level (Better)

//        class Task {
//            int count = 0;
//            void process() {

//          // non-critical work
//          System.out.println("Doing other work");
//
//         synchronized (this) {
//             count++; // only this part locked
//         }
//    }
//}

//        👉 Only critical section locked
//        👉 Better concurrency 🚀

//        5. Object internal lock.
//        💣 6. Deadlock Example

    }
}