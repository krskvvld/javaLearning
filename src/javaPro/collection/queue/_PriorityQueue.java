package javaPro.collection.queue;

import javaPro.collection.Student;

import java.util.PriorityQueue;

public class _PriorityQueue {
    /**
     * Специльный вид очереди, в котором используется натуральная сортировка
     * или та, которую мы описываем с помощью Comparable или Comparator.
     * Таким образом используется тот элемент из очереди, приоритет
     * которого выше.
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(11);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(7);
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());

        PriorityQueue<Student> pqst = new PriorityQueue<>();
        Student st1 = new Student(1, "Name1");
        Student st2 = new Student(2, "Name2");
        Student st3 = new Student(3, "Name3");
        Student st4 = new Student(4, "Name4");
        Student st5 = new Student(5, "Name4");
        pqst.add(st1);
        pqst.add(st2);
        pqst.add(st3);
        pqst.add(st4);
        pqst.add(st5);
        System.out.println(pqst);
        System.out.println(pqst.poll());
        System.out.println(pqst.poll());
        System.out.println(pqst.poll());
        System.out.println(pqst.poll());
        System.out.println(pqst.poll());
    }
}
