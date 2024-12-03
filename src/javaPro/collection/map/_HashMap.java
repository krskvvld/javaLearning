package javaPro.collection.map;

import javaPro.collection.Student;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    public static void main(String[] args) {
        /**
         * В основе лежит массив, элементами этого массива являются структуры LinkedList.
         * Данные структуры LinkedList и заполняются данными, которые мы добавляем в HashMap.
         * Если добавляем элемент, который имеет хэш-код такой же, как и у элемента, что уже
         * имеется, сравниваем по equals():
         *                                  если true: перезаписываем
         *                                  если false: добавляем в бакет в начало односвязного списка
         * Not ordered, not sorted, методы работают быстро.
         */
        Map<Student, Double> hashMap = new HashMap<>(16, 0.75F);
        Student st1 = new Student(1, "Name1");
        Student st2 = new Student(2, "Name2");
        Student st3 = new Student(3, "Name3");
        Student st4 = new Student(4, "Name4");
        Student st5 = new Student(1, "Name8");
        hashMap.put(st1, 7.2);
        hashMap.put(st2, 4.9);
        hashMap.put(st3, 6.24);
        hashMap.put(st4, 5.8);
        hashMap.put(st5, 7.2);

        System.out.println(hashMap);
    }
}