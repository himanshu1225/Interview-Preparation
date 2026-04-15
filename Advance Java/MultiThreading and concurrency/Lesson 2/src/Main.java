public class Main{
    public static void main(String[] args) {
//        1. Thread Life cycle:
//        NEW → RUNNABLE → RUNNING → WAITING / BLOCKED → TERMINATED

//        1. NEW: Thread bana hai but start nahi hua.
        Thread t = new Thread(
                () -> {
                    System.out.println("Running");
                }
        );

//        2. RUNNABLE:
        t.start();
//        👉 JVM bolta hai:
//            “CPU jab free hoga tab ise run karenge”
//        👉 Important:
//             RUNNABLE ≠ running
//             It means eligible to run

//        3. RUNNING (Actually executing)
//        👉 CPU ne pick kar liya
//        System.out.println("Running");  // 👉 Ab ye code execute ho raha hai

//        4. WAITING / BLOCKED (Paused state):
//          Thread temporarily ruk gya.
//          (A) sleep():
//          Thread.sleep(2000);
//        👉 2 sec ke liye ruk gaya
//          (B) join()
//        t1.join();
//        👉 Current thread wait karega
//          jab tak t1 complete na ho
//        (C) Lock nahi mila (Blocked)
//          Example:
//          Do threads ek hi resource use karna chahte hain

//        5. TERMINATED (Finished)
//      👉 Thread ka kaam khatam


        //2.  Thread control methods

//        3. CPU Scheduling is unpredictable:
//        t1.start();
//        t2.start();
//        output:
//        Task1
//        Task2
//        or
//        Task2
//        Task1

//       4.  Real Backend Scenario
        Thread t5 = new Thread(() -> processData());
        t5.start();

        System.out.println("Response sent");
//        Response sent
//        (process happens in background)

//     Thread lifecycle =
//      Thread ka safar (creation → execution → pause/block → finish)
    }

    private static void processData() {
        System.out.println("Pricessing the data");
    }


}