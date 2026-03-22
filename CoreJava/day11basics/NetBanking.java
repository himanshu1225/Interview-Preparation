package CoreJava.day11basics;

public class NetBanking implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying through Net Banking...");
    }

    @Override
    public void refund() {
        System.out.println("Refunding payment through Net Banking...");
    }

}
