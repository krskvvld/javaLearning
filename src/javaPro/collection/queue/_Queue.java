package javaPro.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        /**
         * Коллекция, хранящая последовательность элементов. Добавляется
         * элемент к в конец очереди, используется из начала очереди - FIFO.
         */
        Queue<String> queue = new LinkedList<>();
        queue.add("Elena");
        queue.add("Andrew");
        queue.add("Vlad");
        queue.add("Sasha");
        queue.add("Daniil");

        System.out.println(queue);
    }
}