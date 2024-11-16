package javaPro.collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _Queue {

    public static void main(String[] args) {
        /**
         * Односторонняя очередь, работает по принципу FIFO (элементы добавляются в конец списка,
         * а извлекаются из начала)
         */
        Queue<String> queue = new ArrayDeque<>();
        queue.add("E");
        queue.add("A");
        queue.add("C");
        queue.add("D");
        queue.add("B");

        for (String str : queue) {
            System.out.print(str + " ");
        }

        queue.remove();
        System.out.println();

        for (String str : queue) {
            System.out.print(str + " ");
        }
    }

}