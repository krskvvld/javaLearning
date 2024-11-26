package javaPro.collection.set;

import java.util.LinkedHashSet;

public class _LinkedHashSet {

    public static void main(String[] args) {
        /**
         * Является наследником HashSet, в основе лежит HashMap содержит только
         * уникальные значения, при добавлении дубликата происходит замена
         */
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);

        System.out.println(linkedHashSet);
    }

}git