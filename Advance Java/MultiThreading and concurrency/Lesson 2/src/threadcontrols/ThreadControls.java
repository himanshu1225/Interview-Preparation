package threadcontrols;

public class ThreadControls {
    public static void main(String[] args) {
//    1. sleep(): 👉 Purpose:  Thread ko pause karna

        Thread t = new Thread(
                () ->{
                    System.out.println("Start");
                    try{
                        System.out.println("Wait for 2 second");
                        Thread.sleep(2000);
                    } catch (Exception e) {

                    }
                    System.out.println("End");
                }
        );
//        t.start();

//        ❗ Important Points:
//              Sleep does NOT release lock
//              Only pauses execution

//        2. join (very important)
//          👉  Purpose: Ek thread dusre ka wait kare

        Thread t2 = new Thread(
                ()->{
                    System.out.println("Task 1 completed");
                }
        );

        Thread t3 = new Thread(
                ()->{
                    try {
                        System.out.println("Wait let task 1 starts");
                        t2.join();
                        System.out.println("Task 2 starts now: ");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Task 2 completed");
                }
        );
        t3.start();
        t2.start();
//        Real use case: Report generate krne ke baad hi mail bhejna.

//        3. yield (Rare but asked)
//        👉 Jab thread yield() call karta hai, wo bolta hai CPU ko:
//        “Agar koi aur thread wait kar raha hai, toh usko chance de do”
        System.out.println("Yield.........................................");
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();

        ty1.start();
        ty2.start();

//        output:
//        Thread-3 0
//        Thread-4 0
//        Thread-4 1
//        Thread-4 2
//        Thread-4 3
//        Thread-4 4
//        Thread-3 1
//        Thread-3 2
//        Thread-3 3
//        Thread-3 4

//        or
//        Thread-3 0
//        Thread-3 1
//        Thread-3 2
//        Thread-3 3
//        Thread-3 4
//        Thread-4 0
//        Thread-4 1
//        Thread-4 2
//        Thread-4 3
//        Thread-4 4

//        yield() ≠ guaranteed switch
//        sleep: definitely pause.
//        yield: may be pause (no guarantee)
//        yield() is a hint to the scheduler, not a guarantee
    }
}
