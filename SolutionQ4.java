import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0]; 
    }
}

public class SolutionQ4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers); 

        
        List<Employee> employees = Arrays.asList(
            new Employee("Ramesh Kumar Gupta", 4000L, "Delhi"),
            new Employee("Suresh Singh", 6000L, "Delhi"),
            new Employee("Mahesh Verma", 4500L, "Delhi"),
            new Employee("Ramesh Sharma", 3500L, "Delhi"),
            new Employee("Suresh Kumar", 2500L, "Delhi"),
            new Employee("Amit Mehra", 7000L, "Mumbai"),
            new Employee("Ramesh Yadav", 3000L, "Delhi")
        );

        Set<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.salary < 5000 && emp.city.equalsIgnoreCase("Delhi")) 
                .map(Employee::getFirstName) 
                .collect(Collectors.toSet()); 

        System.out.println("Unique First Names: " + uniqueFirstNames); 
    }
}
