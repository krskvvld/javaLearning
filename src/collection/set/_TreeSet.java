package collection.set;

import java.util.TreeSet;

public class _TreeSet {

    public static void main(String[] args) {
        /**
         * Самый медленный, sorted, нельзя получить элемент по индексу,
         * содержит только уникальные значения, при добавлении дубликата происходит замена
         */
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("A");
        treeSet.add("C");

        for (String str : treeSet) {
            System.out.print(str + " ");
        }
    }

}