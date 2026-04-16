package objectinternallock;

public class MainLock {
    public static void main(String[] args) {
//      Java me Har object ke paas ek hidden lock (monitor) hota hai 🔒
//        synchronized (obj) {
//              // code
//      }

//        👉 JVM internally bolta hai:
//         "obj ka lock le lo"
//        🧩 Simple samajh:
//
//        👉 obj object = room 🚪
//        👉 lock = us room ki key 🔑

//        synchronized (obj)
//        👉 t1 aaya aur bola:
//        "Mujhe obj ka lock chahiye"
//        👉 Agar free hai:
//        t1 → lock mil gaya ✅
//        👉 Ab:
//        koi aur thread andar nahi aa sakta ❌

//        🔥 Step 4: t2 kya karega?
//        synchronized (obj)
//        👉 t2 bhi try karega:
//          "Mujhe obj ka lock chahiye"
//           BUT:
//           obj ka lock already t1 ke paas hai ❌
//        👉 So:
//        t2 → WAIT karega

//        🎯 Important Point
//        👉 Lock object pe hota hai, variable pe nahi
//        synchronized (obj)
//        👉 Means:
//        obj object ka lock use ho raha hai

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t1 entered");
                try { Thread.sleep(2000); } catch (Exception e) {}
                System.out.println("t1 exiting");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t2 entered");
            }
        });

        t1.start();
        t2.start();
    }
}
