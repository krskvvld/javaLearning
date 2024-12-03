package javaPro.collection.queue;

import java.util.*;

public class _Deque {
    public static void main(String[] args) {
        /**
         * Двунаправленная очередь, в такой очереди элементы могут использоваться
         * с обеих концов. Здесь работают оба правила - FIFO и LIFO.
         * Реализуется классами ArrayDeque и LinkedList.
         */
        Deque<Integer> fifoDeque = new ArrayDeque<>();
        fifoDeque.add(2);
        fifoDeque.add(7);
        fifoDeque.add(-2);
        fifoDeque.add(12);
        fifoDeque.add(0);
        System.out.println(fifoDeque);

        Deque<String> deque = new ArrayDeque<>();
        Queue<String> lifoDeque = Collections.asLifoQueue(deque);
        lifoDeque.add("A");
        lifoDeque.add("B");
        lifoDeque.add("C");
        lifoDeque.add("D");
        lifoDeque.add("E");

        System.out.println(lifoDeque);
        System.out.println();
        lifoDeque.remove();
        System.out.println(lifoDeque);
    }
}