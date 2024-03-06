package transformation;

import java.util.Arrays;

public class Reduce {

    public static void main(String[] args) {
        int[] integers = {1,2,3,4,99,100,121,1302,199};
        int sum = Arrays.stream(integers).reduce(0,Integer::sum);
        System.out.println(sum);

    }

}
