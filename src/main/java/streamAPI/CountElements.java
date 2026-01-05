package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar","Sid","Teju","Omkar", "Tim", "Tango");

        //Count Duplicates
        Map<String, Long> nameCounts = names.stream().map(name -> name).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(nameCounts);

        //Find & Filter duplicate names
        HashSet<String> seen = new HashSet<>();
        List<String> duplicateNames = names.stream().filter(name -> !seen.add(name)).collect(Collectors.toList());
        System.out.println(duplicateNames);

        //Find & Filter name starts with letter T
        List<String> namesWithT = names.stream().filter(name -> name.startsWith("T")).collect(Collectors.toList());
        System.out.println(namesWithT);

        //Single name starts with letter T
        String nameWithT = names.stream().sorted().filter(name->name.startsWith("T")).findFirst().orElse("Not found");
        System.out.println(nameWithT);

        //Find & filter names contains letter A
        List<String> nameContainsA = names.stream().filter(name -> name.contains("a")).collect(Collectors.toList());
        System.out.println(nameContainsA);

        //names with 4>= char long
        List<String > nameLong = names.stream().filter(name -> name.length() >= 4).collect(Collectors.toList());
        System.out.println(nameLong);

    }

}
