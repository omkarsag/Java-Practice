package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrToUpper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("onkar","sid","teju");

        //Convert all names to upper case
        List<String> upperNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        List<String> upperNamesMRef = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);
        System.out.println(upperNamesMRef);

        //Convert First letter of name to upper case
        List<String> formattedNames = names.stream().map(name ->
                name.substring(0,1).toUpperCase() + name.substring(1)
                ).collect(Collectors.toList());

        System.out.println(formattedNames);

        //Convert fname and lname first letter to uppercase
        List<String> fullNames = Arrays.asList("onkar sagare","sid sagare","teju sagare");

        List<String> formattedFullNames = fullNames.stream().map((name) -> {
            String[] fandlname = name.split(" ");
            String fname = fandlname[0].substring(0,1).toUpperCase() + fandlname[0].substring(1);
            String lname = fandlname[1].substring(0,1).toUpperCase()+ fandlname[1].substring(1);

            return fname+ " " + lname;
        }).collect(Collectors.toList());
        System.out.println(formattedFullNames);

        //Convert Upper Case Names to formatted
        List<String> upperToFormatted = upperNames.stream().map(name -> name.substring(0) + name.substring(1, name.length()).toLowerCase()).collect(Collectors.toList());
        System.out.println(upperToFormatted);
    }
}
