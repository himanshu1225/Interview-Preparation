package CoreJava.day11basics;

public class CalculatorImpl implements Calculator, Calculator1 {
    @Override
    public int operate(int a, int b) {
        // Resolving conflict by choosing one implementation
        return Calculator1.super.operate(a, b); // Using addition from Calculator
    }

}
