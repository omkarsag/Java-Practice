package streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private LocalDate joinDate;

    public Employee(int id, String name, String department, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
public class SortDate {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(21,"Omkar", "IT", LocalDate.of(2022, 1, 1)),
                new Employee(25,"Teju", "IT", LocalDate.of(2023, 6, 1)),
                new Employee(5,"Tim", "Production", LocalDate.of(2011, 12, 1)),
                new Employee(1,"Tango", "Management", LocalDate.of(2001, 1, 1))
        );

        List<Employee> sortedByIdAsc = employeeList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        System.out.println(sortedByIdAsc);

        //Find Employee with Highest ID (same for salary)
        Employee highestId = employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).findFirst().orElse(null);
        System.out.println(highestId.getId());

        //Find Employee with 2ND Highest ID (same for salary)
        Employee secondHighestId = employeeList.stream()
                                .sorted(Comparator.comparing(Employee::getId)
                                .reversed())
                                .skip(2).findFirst().orElse(null);
        System.out.println(secondHighestId.getId());
    }
}
