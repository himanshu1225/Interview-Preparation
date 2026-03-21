package CoreJava.day6basics;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Himanshu");

        Employee emp2 = new Employee(1, "Himanshu");

        // System.out.println(emp1.equals(emp2)); // false, default equals checks reference

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // System.out.println(s1.equals(s2)); // true, String overrides equals  which check content

        // lets write the custom equals method in Employee class to check content instead of reference
        System.out.println(emp1.equals(emp2));


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1); // duplicate, will not be added
        System.out.println(set.size()); // 1, because duplicates are not allowed in HashSet

        HashSet<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2); 
        System.out.println(empSet.size()); //

    }
}
