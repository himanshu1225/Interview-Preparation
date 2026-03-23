package CoreJava.day15basics;

import java.util.function.Function;

public class FunctionalMain {
    public static void main(String[] args) {
        Function<String, Integer> strLength = (str) -> str.length();

        System.out.println(strLength.apply("Hello World"));


        Function<Integer, Integer> square = (num) -> num*num;

        System.out.println(square.apply(5));
    }
}
