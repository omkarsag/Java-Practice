package streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    private int id;
    private String name;
    private int age;

    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class FilterEmployees {

    public static void main(String[] args) {

        List<Emp> empList = Arrays.asList(
                new Emp(1,"Omkar", 32),
                new Emp(1,"Teju", 22),
                new Emp(1,"Tim", 32)
        );

        Map<Integer, List<Emp>> empByAge =
                empList.stream().collect(Collectors.groupingBy(Emp::getAge));
        System.out.println(empByAge);

    }

}
