package CoreJava.day11basics;

public interface Calculator {
    default int operate(int a, int b){
        return a + b;
    }

    // @Override
    // default boolean equals(Object obj){
    //     return super.equals(obj);
    // }
}
