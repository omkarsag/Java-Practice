package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Omkar","Sid","Teju","Omkar", "Tim", "Tango");

        String namesWithComma = names.stream().collect(Collectors.joining(","));
        System.out.println(namesWithComma);
    }
}
