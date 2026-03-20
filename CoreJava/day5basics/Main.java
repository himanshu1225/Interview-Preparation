package CoreJava.day5basics;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Google");
        emp1.empId = 101;
        emp1.empName = "Himanshu Bhati";
        // emp1.companyName = "Tech Company"; // This line will cause a compilation error because companyName is final and cannot be reassigned.

        emp1.printEmployeeDetails();

        Employee emp2 = new Employee("Microsoft");
        emp2.empId = 102;
        emp2.empName = "Shenu";
        emp2.printEmployeeDetails();

        Intern intern1 = new Intern("Google");
        intern1.empId = 201;
        intern1.empName = "Intern A";
        intern1.printEmployeeDetails();
        intern1.greet(); // This will call the greet method from the Employee class, as it cannot be overridden in the Intern class.
    }
}
