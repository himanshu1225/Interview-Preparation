package CoreJava.day15basics;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> {
            return num % 2 == 0;
        };

        // when lambda has only one statement, we can skip the return keyword and curly braces
        Predicate<Integer> isEvenShort = num -> num % 2 == 0;   

        System.out.println(isEven.test(6));
        System.out.println(isEvenShort.test(3));

        Predicate<String> string = (str) -> str.isEmpty();
        System.out.println(string.test("Hello"));

        

    }
}
