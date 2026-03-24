package CoreJava.day16basics;

@FunctionalInterface
public interface Creator<T> {
    T create(String name);
}
