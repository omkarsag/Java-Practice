package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        //Simple Way
        List<Integer> even = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        List<Integer> odd = numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(odd);

        //By Partitioning
        Map<Boolean, List<Integer>> evenOdd = numbers.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
        System.out.println(evenOdd.get(true));
        System.out.println(evenOdd.get(false));
    }
}
