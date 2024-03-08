package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {

        Map<Object,List<String>> simpleGrouping = lista().stream()
                .collect(Collectors.groupingBy(name -> name.contains("M")));
        simpleGrouping.forEach((s,name) -> {
            System.out.println("s" +s);
            name.forEach(System.out::println);
            System.out.println("__________________________");
        });

        Map<String,Long> names2 = lista().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(names2);
    }

    private static List<String> lista() {
        List<String> names = List.of("Manu","Manu","Manu","Alejo", "Eli","Alejo","Dani","Luciana","Mama","Papa","Max","Loky","Toby","Wanda","Missy","Luna");
        return names;
    }
}
