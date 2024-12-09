package javaPro.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class streamMethodMap {
    /** Stream - это последовательность элементов, поддерживающих
     * последовательные и параллельные операции над ними.
     *
     * Метод map() берет каждый элемент из набора данных,
     * преобразует его с помощью заданной функции и возвращает
     * новый набор с результатами преобразования.
     */
    public static void main(String[] args) {

        int[] array = {1, 9, 3, 2, 5};
        array = Arrays.stream(array).map(e -> {
            if (e % 3 == 0)
                e = e / 3;
            return e;
        }).toArray();

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");
        stringSet.add("C");
        Set<Integer> integerSet = stringSet.stream().map(element -> element.length() + 1).collect(Collectors.toSet());
        System.out.println(integerSet);

        List<String> list1 = new ArrayList<>();
        list1.add("Vlad");
        list1.add("Sasha");
        list1.add("Valera");
        list1.add("Andrew");

        List<Integer> list2 = list1.stream().map(String::length).toList();
    }
}