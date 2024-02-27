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

        System.out.println("filter");
        Stream.of(2,4,6,8,9,10,12).filter(n -> n % 2 ==0).forEach(System.out::println);
        System.out.println("take");
        Stream.of(2,4,6,8,9,10,12).takeWhile(n -> n % 2 ==0).forEach(System.out::println);
        System.out.println("dropwhile");
        Stream.of(2,4,6,8,9,10,12).dropWhile(n -> n % 2 ==0).forEach(System.out::println);

        System.out.println("findfirst");
        System.out.println(Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n == 9).findFirst().orElse(-1));
        System.out.println("findany");
        System.out.println(Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n == 9).findAny().orElse(-1));

        System.out.println("allmatch");
        System.out.println(Stream.of(2, 4, 6, 8,10,11).allMatch(n -> n % 2 ==0));

        System.out.println("anymatch");
        System.out.println(Stream.of(2, 4, 6, 8,10,11).anyMatch(n -> n % 2 ==0));

    }
}
