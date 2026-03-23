package CoreJava.day14basics;

public class Main {
    public static void main(String[] args) {

    // Vehicle v = new Vehicle();
    // c.start()


        Vehicle v = new Vehicle() {
            @Override
            public void start(){
                System.out.println("Vehicle is starting...");
            }
        };
        v.start();

    Vehicle v2 = () -> System.out.println("Vehicle is starting...");
    v2.start();

    Greeting g = () -> System.out.println("Hello, welcome to Java!" );
    g.sayHello();

    // Square s = (size) -> {return size*size;};
    // System.out.println(s.calculateArea(5));

    // for one argument we can write
    Square s = size -> size*size;
    System.out.println(s.calculateArea(5)); 

    Calclulate c = (a, b) -> {
        return a+b;
    };
    System.out.println(c.operate(5, 10));   
    }
}
