package interfaces;


import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println(incrementByOne(2));
        System.out.println(incrementByOneFunc.apply(3));
        System.out.println(incrementByOneFunc.andThen(doubleFunction).apply(2));
        System.out.println(biFunction.apply(4,2));
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n + 1;

    static Function<Integer, Integer> doubleFunction =  n -> n * 2;

    static BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a * b;

    static int incrementByOne(int n){
        return n +1;
    }
}
