package collection.set;

import java.util.LinkedHashSet;

public class _LinkedHashSet {

    public static void main(String[] args) {
        /**
         * Расширяет HashSet, ordered, not sorted, нельзя получить элемент по индексу,
         * содержит только уникальные значения, при добавлении дубликата происходит замена
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("A");
        linkedHashSet.add("C");

        for (String str : linkedHashSet) {
            System.out.print(str + " ");
        }
    }

}