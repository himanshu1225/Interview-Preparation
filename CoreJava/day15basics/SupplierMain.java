package CoreJava.day15basics;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int) Math.random() * 100;
        System.out.println(randomNumber.get());


        Supplier<String> string = () ->{
            String a = "Hello";
            String b = "World";
            return a + " " + b;
        };

        System.out.println(string.get());
    }
}
