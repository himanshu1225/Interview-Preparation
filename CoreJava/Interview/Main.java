import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, LocalDate.of(2020, 1, 15));
        Employee emp2 = new Employee("Bob", 60000, LocalDate.of(2019, 5, 10));
        Employee emp3 = new Employee("Charlie", 55000, LocalDate.of(2021, 3, 20));
 
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getJoiningDate().isAfter(LocalDate.of(2020, 4, 1)))
                .map(emp -> new Employee(emp.getName(), emp.getSalary() * 1.10, emp.getJoiningDate()))
                .collect(Collectors.toList());
        // this will have only those employees who joined after April 1, 2020 and their salary will be increased by 10%

        // filteredEmployees.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));

        // If we want  complete dataset with partial updates

        List<Employee> updatedEmployees = employees.stream().map(
            (emp) -> {
                if(emp.getJoiningDate() != null && emp.getJoiningDate().isAfter(LocalDate.of(2020,3,31))){
                    return new Employee(emp.getName(), emp.getSalary()*1.10, emp.getJoiningDate());
                }
                return emp;
            }
        ).collect(Collectors.toList());

        updatedEmployees.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));
        
        }
    }
