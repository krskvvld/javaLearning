package javaPro.collection.map;

import javaPro.collection.Student;

import java.util.TreeMap;

public class _TreeMap {
    public static void main(String[] args) {
        /**
         * Элементами TreeMap являются пары ключ/значение. Not ordered, sorted.
         * В основе лежит красно-чёрное дерево. Это позволяет методам работать
         * быстро, но не быстрее, чем методы в HashMap
         */
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student(1, "Vlad");
        Student st2 = new Student(2, "Sasha");
        Student st3 = new Student(3, "Andrew");
        Student st4 = new Student(4, "Vlad");
        Student st5 = new Student(5, "Masha");
        Student st6 = new Student(6, "neVlad");
        Student st7 = new Student(7, "Sasha");

        treeMap.put(st1, 4.21);
        treeMap.put(st2, 8.41);
        treeMap.put(st3, 5.36);
        treeMap.put(st4, 10.0);
        treeMap.put(st5, 6.12);
        treeMap.put(st6, 8.1);
        treeMap.put(st7, 5.21);

        System.out.println(treeMap);
    }
}