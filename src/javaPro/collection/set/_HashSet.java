package javaPro.collection.set;

import java.util.HashSet;

public class _HashSet {

    public static void main(String[] args) {
        /**
         * Коллекция, хранящая уникальные элементы, при добавлении дубликата
         * происходит замена. Методы данной коллекции очень быстрые.
         * Not ordered, not sorted, нельзя получить элемент по индексу.
         */
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);
    }

}