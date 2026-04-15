package lock;

public class Lock {

//      Soch:
//
//    👉 Ek washroom 🚻 hai (shared resource)
//
//    Person A andar hai
//    Person B bahar wait kar raha
//    Person A → using washroom (lock le liya)
//    Person B → WAIT (lock nahi mila)
//
//    👉 Jab tak A bahar nahi aata → B andar nahi ja sakta
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(
                () -> c.increment()
        );
        Thread t2 = new Thread(()-> c.increment());

        t1.start();
        t2.start();

//      Step 1:
//          👉 t1 enters increment()
//          Lock mil gaya ✅
//          Kaam kar raha hai
//      Step 2:
//          👉 t2 also tries increment()
//          BUT:
//          Lock already t1 ke paas hai ❌
//          👉 So:
//          t2 → WAITING (BLOCKED state)
//      Step 3:
//          👉 t1 finishes
//          Lock release
//      Step 4:
//          👉 t2 gets lock
//          Now runs

//        🔒 Lock kya hai?
//          👉 Ek permission / key jo ensure karta hai:
//          “Ek time pe sirf ek thread critical section me jaa sakta hai”

//        🔴 Blocked State
//          👉 Jab thread: Resource use karna chahta hai, But lock nahi mila
//          👉 Tab wo BLOCKED state me chala jata hai

//         💣 Why Lock Needed?
//          Agar lock na ho:
//          count++;
//        👉 Multiple threads ek saath modify karenge
//        👉 Result galat (race condition)

//        Lock = “Entry pass”
//          Jiske paas pass hai → wahi andar jaa sakta hai
    }


}
