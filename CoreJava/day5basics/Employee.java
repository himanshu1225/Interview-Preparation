package CoreJava.day5basics;

public class Employee {
    long empId;
    String empName;
    //final String companyName = "Tech Company"; // This variable is declared as final, meaning its value cannot be changed once assigned.

    final String companyName;

    public Employee(String company) {
        this.companyName = company;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company Name: " + companyName);
    }

    public final void greet() {
        System.out.println("This employee works at " + companyName);
    }
}
