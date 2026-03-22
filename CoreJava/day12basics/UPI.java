package CoreJava.day12basics;

public class UPI implements Payment {
    @Override
    public void pay(double amount) {
        // Implementation for UPI payment
        System.out.println("Processing UPI payment of amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        // Implementation for UPI refund
        System.out.println("Processing UPI refund of amount: " + amount);
    }   

}
