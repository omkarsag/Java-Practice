package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Demo {
    private int id;
    private String name;
    private int age;

    public Demo(int id, String name, int age) {
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
public class ConvertToMap {
    public static void main(String[] args) {

        List<Demo> demoList = Arrays.asList(
                new Demo(1,"Omkar",32),
                new Demo(2,"Teju", 26)
        );

        //output to convert to map { id -> {name, age}}

        Map<Integer, Demo> demoMap =
                demoList.stream().collect(Collectors.toMap(
                        Demo::getId,
                        demo -> demo
                ));

        System.out.println(demoList);
        System.out.println(demoMap);
    }
}
