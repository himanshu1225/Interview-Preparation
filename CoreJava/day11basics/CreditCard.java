package CoreJava.day11basics;

public class CreditCard  implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through Credit Card...");
    }
    
}
