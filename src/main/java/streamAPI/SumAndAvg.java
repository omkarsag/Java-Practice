package streamAPI;

import java.util.Arrays;
import java.util.List;

public class SumAndAvg {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,22,33,64,45,16);

        //Sum
        Integer sum = numbers.stream().mapToInt(n->n).sum();
        Integer sumMRef = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(sumMRef);

        //Average
        Double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);

        List<Integer> numbers2 = Arrays.asList(1,2,3,4);
        Integer multipled = numbers2.stream().reduce(1,(a,b)-> a*b);
        System.out.println(multipled);

    }
}
