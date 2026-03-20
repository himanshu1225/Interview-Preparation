public class Day3 {
    public static void main(String[] args) {
        System.out.println("----------------------Integral Numbmers----------------------");

        System.out.println("Byte MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Short MIN_VALUE: " + Short.MIN_VALUE);
        System.out.println("Short MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Long MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Long MAX_VALUE: " + Long.MAX_VALUE);

        // byte byteValue = 200; // This will cause a compilation error because 200 is out of byte range

        long longValue = 1000000;

        long longValue2 = 2147483648L; // This is within the range of long, but it is the more than maximum value for
                                       // int, so we need to add 'L' at the end to indicate that it is a long literal.

        System.out.println("----------------------Decimal Numbmers----------------------");

        float mySalary = 10000.116345342342f; // By default, decimal literals are treated as double, so we need to add 'f' at the end to indicate that it is a float literal.

        double mySalary2 = 10000.111534342349; // This is fine because decimal literals are treated as double by default.

        System.out.println("mySalary: " + mySalary);
        System.out.println("mySalary2: " + mySalary2);

        System.out.println("----------------------Characters----------------------");
        char initial = 'A';
        System.out.println((int) initial);

        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);

        char correspondingChar = 65; // This will print 'A' because 65 is the Unicode value for 'A' 
        System.out.println(correspondingChar);

        System.out.println((char) 10084);

        // Standardised way to represent is unicode representation of the character. 
        char heart = '\u2764'; // backslash u means it is hexadecimal representation of the character and 2764 is the hexadecimal value for the heart symbol in Unicode.
        System.out.println(heart);

        // ASCII value 0 to 127
        for (int i = 0; i < 128; i++) {
            System.out.println(i + " : " + (char) i);
        }

        System.out.println("----------------------Boolean----------------------");
        boolean isJavaFun = true;
        boolean isProgrammingDifficult = false;
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isProgrammingDifficult: " + isProgrammingDifficult);
    }
}
