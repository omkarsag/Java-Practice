package streamAPI;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringPlay {
    public static void main(String[] args) {
        String name = "Oamkar";

        //count no of chars
        System.out.println(name.length());

        //Letter Frequency
        Map<Character, Long> letterFreq = name.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(letterFreq);

        //Duplicate Letters
        HashSet<Character> seen = new HashSet<>();
        List<Character> duplicateLetters = name.chars().mapToObj(c -> (char) c).filter(c -> !seen.add(c)).collect(Collectors.toList());
        System.out.println(duplicateLetters);
    }
}
