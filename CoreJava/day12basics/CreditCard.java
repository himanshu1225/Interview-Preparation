package CoreJava.day12basics;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        // Implementation for credit card payment
        System.out.println("Processing credit card payment of amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        // Implementation for credit card refund
        System.out.println("Processing credit card refund of amount: " + amount);
    }

    }   


