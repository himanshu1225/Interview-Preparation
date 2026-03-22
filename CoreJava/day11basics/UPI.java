package CoreJava.day11basics;

public class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through UPI...");
    }

}
