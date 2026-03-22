package CoreJava.day11basics;

public interface Calculator1 {
    default int operate(int a, int b){
        return a * b;
    }
}
