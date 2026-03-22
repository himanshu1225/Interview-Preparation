package CoreJava.day11basics;

public interface Payment {
    void pay();

    default void refund() {
        System.out.println("Refunding payment...");
    }   
}
