package CoreJava.day13basics;

public class Demo {
   
    public void demo(){


        // Vehicle v = new Vehicle(); // This will give an error because Vehicle is an interface and cannot be instantiated.
        // v.start(); // We do not have an implementation of the start method, so this will also give an error.

        // This is an anonymous class that implements the Vehicle interface

        Vehicle vehicle = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Vehicle is starting...");
            }
        };

        vehicle.start();

        // So we do not need separate classes like Car and Bike to implement the Vehicle interface. We can directly create an anonymous class that implements the Vehicle interface and provides the implementation of the start method.
    
        Vehicle v = () -> { System.out.println("Vehicle is starting..."); };// This is a lambda expression that provides the implementation of the start method of the Vehicle interface.
        v.start();


        Calculator calc = (a,b) -> {return a+b;};
        int result = calc.sum(5, 10);
        System.out.println("Sum: " + result);

        MyInterface myInterface = () -> Greeting.greet(); 
        myInterface.printMessage();

        // Using Method Reference:
        
        MyInterface myInterface2 = Greeting::greet;  // Whenever we have a lambda expression that just calls a method from a class, we can replace it with a method reference. The syntax for method reference is ClassName::MethodName.
        myInterface2.printMessage();


        MyInterface2 myInterface3 = (a,b) -> MathUtil.add(a,b);
        int sumResult = myInterface3.sum(5, 10);
        System.out.println("Sum: " + sumResult);

        MyInterface2 myInterface4 = MathUtil::add; // Method reference for static method 
        System.out.println("Sum using method reference: " + myInterface4.sum(5, 10));
    }
}
