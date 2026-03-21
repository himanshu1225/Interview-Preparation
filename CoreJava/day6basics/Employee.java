package CoreJava.day6basics;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
   

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // check reference
        
        Employee other = (Employee) obj; // cast to Employee
        
        return id == other.id && name.equals(other.name); // check content
    }

    public int hashCode() {
        return Objects.hash(id, name); 
        // generate hash code based on id and name, consistent with equals
        // if id and name are same, hash code will be same.
    }
}
