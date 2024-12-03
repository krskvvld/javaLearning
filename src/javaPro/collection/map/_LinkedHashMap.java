package javaPro.collection.map;

import javaPro.collection.Student;

import java.util.LinkedHashMap;

public class _LinkedHashMap {
    public static void main(String[] args) {
        /**
         * Является наследником HashMap, хранит информацию о порядке добавления элементов
         * или порядке их использования. Производительность методов немного ниже, чем у
         * HashMap.
         */
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75F, true);
        Student st1 = new Student(1, "Name1");
        Student st2 = new Student(2, "Name2");
        Student st3 = new Student(3, "Name3");
        Student st4 = new Student(4, "Name4");

        linkedHashMap.put(5.4, st1);
        linkedHashMap.put(6.2, st2);
        linkedHashMap.put(4.4, st3);
        linkedHashMap.put(8.4, st4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(5.4));
        System.out.println(linkedHashMap.get(8.4));

        System.out.println(linkedHashMap);
    }
}