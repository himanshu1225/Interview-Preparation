public class Main{
    public static void main(String[] args) {
//        Thread Life cycle:
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

    }
}