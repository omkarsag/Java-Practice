package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar","Sid","Teju","Omkar", "Tim", "Tango");

        //Unique names
        List<String> uniqueNames = names.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNames);
    }

}
