package javaPro.collection.set;

import javaPro.collection.Student;

import java.util.TreeSet;

public class _TreeSet {

    public static void main(String[] args) {
        /**
         * Хранит элементы в отсортированном по возростанию порядке. В основе TreeSet
         * лежит TreeMap. Основан на красно-чёрном дереве. У элементов данного
         * TreeMap: ключи - это элементы  TreeSet, значения - константа-заглушка.
         */
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new javaPro.collection.Student(1, "Vlad");
        Student st2 = new javaPro.collection.Student(2, "Sasha");
        Student st3 = new javaPro.collection.Student(3, "Andrew");
        Student st4 = new javaPro.collection.Student(4, "Vlad");
        Student st5 = new javaPro.collection.Student(5, "Valera");
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet);
    }

}