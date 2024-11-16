package javaPro.collection.set;

import java.util.HashSet;

public class _HashSet {

    public static void main(String[] args) {
        /**
         * Самый быстрый, not ordered, not sorted, нельзя получить элемент по индексу,
         * содержит только уникальные значения, при добавлении дубликата происходит замена
         */
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("A");
        hashSet.add("C");

        for (String str : hashSet) {
            System.out.print(str + " ");
        }
    }

}