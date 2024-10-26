package collection.list;

import java.util.LinkedList;

public class _LinkedList {

    public static void main(String[] args) {
        /**
         * Двунаправленный список, ordered, быстрый для добавления и удаления элементов,
         * часто используется для создания очереди/стэка
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("A");
        linkedList.add("C");

        System.out.println(linkedList.get(2));

        for (String str : linkedList) {
            System.out.print(str + " ");
        }
    }

}