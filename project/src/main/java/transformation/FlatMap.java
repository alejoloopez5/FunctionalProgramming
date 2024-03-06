package transformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        final List<List<String>> arrayListOfNames = List.of(
                List.of("Eli", "Alejo", "Luciana"),
                List.of("Toby", "Loky", "Wanda", "Missy"),
                List.of("Konan", "Mati", "Orejitas", "Dulce")
        );

        List<String> names = new ArrayList<>();
        for (List<String> strings: arrayListOfNames){
            names.addAll(strings);
        }

        System.out.println(names);

        List<String> names2 = arrayListOfNames.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(names2);

    }
}
