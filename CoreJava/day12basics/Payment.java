package CoreJava.day12basics;

public interface Payment {
    void pay(double amount); 
    void refund(double amount);

    static boolean isValidAmount(double amount) {
        logTime();
        return amount > 0;
    }

    static void logTime() {
        System.out.println("Payment processed at: " + java.time.LocalDateTime.now());
        // method1(); // This will cause a compile-time error because static methods cannot call instance methods directly
    }

    default void method1() {
        System.out.println("Default method in Payment interface");
    }

}
