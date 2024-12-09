package javaPro.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class streamMethodReduce {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(7);
        list1.add(9);
        int result1 = list1.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result1);

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> integerOptional = list2.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (integerOptional.isPresent()) {
            System.out.println(integerOptional.get());
        } else {
            System.out.println("Not present");
        }

        int result3 = list1.stream().reduce(2, (accumulator, element) ->
                accumulator * element);
        System.out.println(result3);

        List<String> list4 = new ArrayList<>();
        list4.add("Hello");
        list4.add("World");
        list4.add("Java");
        list4.add("Python");
    }
}