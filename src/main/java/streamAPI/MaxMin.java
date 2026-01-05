package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,29,38,20,37,29);

        Integer max = numbers.stream().max(Integer::compareTo).get();
        Integer min = numbers.stream().min(Integer::compareTo).get();
        System.out.println(max);
        System.out.println(min);
    }
}
