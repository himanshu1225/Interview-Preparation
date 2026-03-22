package CoreJava.day12basics;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCard();
        creditCardPayment.pay(100.0);
        creditCardPayment.refund(50.0);
        // creditCardPayment.isValidAmount(100.0); // This will call the static method from the interface

        NetBanking netBankingPayment = new NetBanking();
        netBankingPayment.pay(200.0);
        netBankingPayment.refund(75.0);
        netBankingPayment.isValidAmount(2);

        Payment.isValidAmount(10);
    }
}
