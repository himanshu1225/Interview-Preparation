package deadlock;

public class DeadlockExample {
    static Resource r1 = new Resource();
    static Resource r2 = new Resource();
//      🔥 Correct Understanding
//      ✅ With static
//      static Resource r1 = new Resource();
//      static Resource r2 = new Resource();
//      👉 Sirf ek hi r1 aur r2 poori class me exist karte hain

//      Thread 1 → uses r1, r2 (same)
//      Thread 2 → uses r1, r2 (same)
//
//      👉 ✔️ Shared → conflict possible → deadlock possible
//
//      ❌ Without static (IMPORTANT)
//      Resource r1 = new Resource();
//      Resource r2 = new Resource();
//
//      👉 Ab depend karta hai tum kaise use kar rahe ho
//
//      🧩 Case 1: SAME object use ho raha
//      DeadlockExample obj = new DeadlockExample();
//
//      Thread t1 → obj.r1, obj.r2
//      Thread t2 → obj.r1, obj.r2
//
//      👉 ✔️ Still shared
//      👉 ✔️ Deadlock possible ✅
//
//      🧩 Case 2: DIFFERENT objects
//      DeadlockExample obj1 = new DeadlockExample();
//      DeadlockExample obj2 = new DeadlockExample();
//
//      Thread t1 → obj1.r1, obj1.r2
//      Thread t2 → obj2.r1, obj2.r2
//
//      👉 ❌ Not shared
//      👉 ❌ No deadlock

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread1 locked r1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (r2) {
                    System.out.println("Thread1 locked r2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread2 locked r2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (r1) {
                    System.out.println("Thread2 locked r1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
//          ✅ Part 1
//
//          t1.start()
//          t2.start()
//          main thread line by line dono start kar deta hai
//
//          Main thread:
//          t1.start();  // call ho gaya
//          t2.start();  // call ho gaya
//
//          👉 BUT IMPORTANT:
//
//          start() ka matlab ye nahi ki turant run() execute ho gaya
//
//
//          👉 start() =
//          Thread ko RUNNABLE state me daal diya
//          👉 Run kab hoga?
//          CPU scheduler decide karega

//          Deadlock hona guaranteed nahi hota
//          Chahe sleep() ho ya na ho
//          👉 Ho bhi sakta hai, nahi bhi ho sakta
//
//          🧠 Why?
//
//          👉 Kyunki sab depend karta hai:
//
//           Thread execution order (scheduler pe)

//      👉 Kyunki sleep() overlap badhata hai (dono threads ko beech me rok deta hai), isliye deadlock zyada easily reproduce hota hai.

//            | Case          | Deadlock chance    |
//            | ------------- | ------------------ |
//            | with sleep    | HIGH               |
//            | without sleep | LOW (but possible) |


//          Main possible execution
//          🔥 Main tujhe exact flow likh deta hoon
//          ⏱️ Step 1: main thread
//          main → t1.start()
//          main → t2.start()
//
//          👉 Dono threads ready ho gaye
//
//          ⏱️ Step 2: CPU picks t1
//          t1 → synchronized(r1) → lock r1 🔒
//          ⏱️ Step 3: t1 sleep
//          t1 → sleep(100)
//
//          👉 Lock release nahi hua ❗
//
//          ⏱️ Step 4: CPU switch → t2
//          t2 → synchronized(r2) → lock r2 🔒
//          ⏱️ Step 5: t2 sleep
//          t2 → sleep(100)
//        ⏱️ Step 6: t1 wakes up
//        t1 → wants r2 ❌ (blocked)
//        ⏱️ Step 7: t2 wakes up
//        t2 → wants r1 ❌ (blocked)
//        💣 Final
//        t1 → waiting for r2
//        t2 → waiting for r1
//
//        👉 ✔️ DEADLOCK