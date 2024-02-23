package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,2,3,4,5,5,5,6,6,7,8,9,10);
        List<Integer> numbersWithSet = List.of(1,1,2,2,3,4,5,5,5,6,6,7,8,9,10);

        numbers.stream().distinct().forEach(System.out::println);
        numbersWithSet.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
