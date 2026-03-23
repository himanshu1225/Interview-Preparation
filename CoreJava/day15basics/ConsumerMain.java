package CoreJava.day15basics;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> name = (nme)-> System.out.println(nme);
        name.accept("Himanshu");


        Consumer<Integer> age = (myAge) -> System.out.println("My age is: " + myAge);
        age.accept(25);
    }
}
