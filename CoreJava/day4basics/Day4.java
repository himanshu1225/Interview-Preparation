public class Day4 {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int a = shortValue;
        long b = a;
        float c = a;
        double d = a;
        System.out.println("value of d: "+ d);

        float f = 1.7f;
       // int j = f; // This will cause a compilation error because we cannot convert a float to an int without explicit casting.
      
       int j = (int) f; // This is fine because we are explicitly casting the float to an int, but it will cause loss of precision because the decimal part will be truncated.

       System.out.println("value of j: " + j);

       // Narrowing conversion can lead to data loss.

       double doubleValue = 1223.4563940234982;
       float floatValue = (float) doubleValue; // This is fine because we are explicitly casting the double to a float, but it will cause loss of precision because the float type has less precision than the double type.
       
       System.out.println("value of floatValue: " + floatValue);
        
       long lvalue = (long) floatValue;
       System.out.println("value of lvalue: " + lvalue);

       long longEx = Long.MAX_VALUE;
       int intEx = (int) longEx; 
       System.out.println(intEx); // This will print -1 because the value of longEx is greater than the maximum value of int, so it will wrap around and give us a negative value. This is called integer overflow.
        
       int intEx2 = Integer.MAX_VALUE;
       short shortEx = (short) intEx2;
        System.out.println(shortEx); // This will print -1 because the value of intEx2 is greater than the maximum value of short, so it will wrap around and give us a negative value. This is also called integer overflow.

        byte byteN1 = 3;
        byte byteN2 = 4;

       // byte result = byteN1 + byteN2; // This will cause a compilation error because the result of adding two bytes is promoted to an int, and we cannot assign an int to a byte without explicit casting.

        byte result = (byte) (byteN1 + byteN2 );
        System.out.println("result: " + result);


        int intN1 = 10;
        long longN1 = 20;
        long res =  intN1 + longN1; // This is fine because the result of adding an int and a long is promoted to a long, and we can assign a long to a long variable without any issues.
        System.out.println("res: " + res);

        byte op = 127;
        op++;
        System.out.println(op);

        short s = 10;
       // s = s + 5; // This will cause a compilation error because the result of adding a short and an int is promoted to an int, and we cannot assign an int to a short without explicit casting.

       s = (short) (s + 5);

       int x = 'a' + 1; // char is promoted to int when we perform arithmetic operations on it, so 'a' is promoted to its Unicode value which is 97, and then we add 1 to it, resulting in 98.
       System.out.println(x); 
        
    }    

}