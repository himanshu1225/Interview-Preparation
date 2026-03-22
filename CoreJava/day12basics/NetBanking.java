package CoreJava.day12basics;

public class NetBanking implements Payment {
    @Override
    public void pay(double amount) {
       System.out.println("Processing NetBanking payment of amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Processing NetBanking refund of amount: " + amount);
    }

    

    // This method is not overriding the static method in the interface, it's a separate instance method (METHOD HIDING)
    public boolean isValidAmount(double amount) {
        return amount > 0;
    }

}
