package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {
        List<String> names = List.of("Manu", "Alejo", "Eli", "Milo");
        List<String> myName = names.stream().filter(name -> name.equals("Eli")).collect(Collectors.toList());
        System.out.println(myName);

        Stream.of(2,4,6,8,9,10,12).filter(n -> n % 2 ==0).forEach(System.out::println);
        Stream.of(2,4,6,8,9,10,12).takeWhile(n -> n % 2 ==0).forEach(System.out::println);
    }
}
