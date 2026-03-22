package CoreJava.day11basics;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        payment1.pay();
        payment1.refund();

        Payment payment2 = new NetBanking();
        payment2.pay();
        payment2.refund();

        Payment payment3 = new UPI();
        payment3.pay();
        payment3.refund();


        CalculatorImpl calculator = new CalculatorImpl();
        int result = calculator.operate(5, 3);
        System.out.println("Result of operation: " + result);
    }
}
