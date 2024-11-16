package javaPro.collection.queue;

import java.util.*;

public class _Deque {

    public static void main(String[] args) {
        /**
         * Двусторонняя очередь, работает как по принципу FIFO, так и LIFO
         */
        Deque<String> fifoDeque = new ArrayDeque<>();
        fifoDeque.add("A");
        fifoDeque.add("B");
        fifoDeque.add("C");
        fifoDeque.add("D");
        fifoDeque.add("E");

        System.out.println(fifoDeque.getFirst());

        for (String str : fifoDeque) {
            System.out.print(str + " ");
        }
        System.out.println();
        fifoDeque.remove();
        for (String str : fifoDeque) {
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println();

        Deque<String> deque = new ArrayDeque<>();
        Queue<String> lifoDeque = Collections.asLifoQueue(deque);
        lifoDeque.add("A");
        lifoDeque.add("B");
        lifoDeque.add("C");
        lifoDeque.add("D");
        lifoDeque.add("E");

        for (String str : lifoDeque) {
            System.out.print(str + " ");
        }
        System.out.println();
        lifoDeque.remove();
        for (String str : lifoDeque) {
            System.out.print(str + " ");
        }
    }

}