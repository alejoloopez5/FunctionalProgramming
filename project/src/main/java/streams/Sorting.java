package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        List<String> names = List.of("dulce","manu","eli","alejo","loky","toby","wanda","konan","michi");

        System.out.println("sorted in order asc");
        names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("sorted in order desc");
        names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        String join = names.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .collect(Collectors.joining(","));

        System.out.println(join);
    }

}
