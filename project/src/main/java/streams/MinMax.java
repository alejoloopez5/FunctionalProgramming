package streams;

import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,100,23,93,99);
        Integer min = numbers.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        Integer max = numbers.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(String.format("Este es el minimo: %s y este el maximo: %s",min,max));
    }

}
