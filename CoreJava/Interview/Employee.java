import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate joiningDate;

    public Employee(String name, double salary, LocalDate joiningDate) {
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    
}
