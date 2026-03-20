package CoreJava.day5basics;

public class MathsMain {
public static void main(String[] args) {
    Maths maths = new Maths();
    // int result1 = maths.divide(10, 2);
    // System.out.println("Result of 10 divided by 2: " + result1);

    int result2 = maths.divide(10, 0); // This will cause an exception
    System.out.println("Result of 10 divided by 0: " + result2);
}
}
