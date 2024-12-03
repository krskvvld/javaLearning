package javaPro.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class streamMethodForEach {
    public static void main(String[] args) {
        int[] array = {2, 3, 9, 0, -2, 5};
        Arrays.stream(array).forEach(System.out::println);

        Stream<Integer> myStream = Stream.of(2, 3, 9, -2, 5);
        myStream.forEach(element -> element *= 2);
        System.out.println(Arrays.toString(array));
    }
}